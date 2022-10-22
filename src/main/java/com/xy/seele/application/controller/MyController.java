package com.xy.seele.application.controller;

import com.xy.seele.application.pojo.UserLogin;
import com.xy.seele.application.util.IDUTILS;
import com.xy.seele.application.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xy.seele.application.service.UserLoginServicesImpl;

@Controller
public class MyController {
    @Autowired
    UserLoginServicesImpl userLoginServicesImpl;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/LoginSuccess")
    public String LoginSuccess(Model model, UserLogin userLogin) {
        //先查询看该用户名是否存在
        UserLogin userLogin1 = userLoginServicesImpl.queryByName(userLogin.getUsername());
        if (userLogin1 != null) { //  如果查询的用户不为空
            System.out.println(userLogin1.toString());
            return "success";
        } else {
            //返回到登录页面
            model.addAttribute("data", "该用户不存在，请先注册");
            return "login";
        }
    }

    //登录界面
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/RegisterSuccess")
    public String toRegisterSuccess(Model model, UserLogin userLogin) {
        //将账号密码加入到数据库中
        userLogin.setId(IDUTILS.getId());
        if (!StringUtils.isEmpty(userLogin.getPassword())) {
            userLogin.setKey("1");
        }
        int add = userLoginServicesImpl.add(userLogin);
        System.out.println("数据插入成功！");
        model.addAttribute("data", "注册成功，请登录！");
        return "login";
    }
}
