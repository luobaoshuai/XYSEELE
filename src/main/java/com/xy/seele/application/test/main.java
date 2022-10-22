package com.xy.seele.application.test;

import com.xy.seele.application.controller.MyController;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.xy.seele.application.test.Father");
        Father father=new Father();
        Father cast = (Father) aClass.cast(father);
        aClass.getField("SPRING");
        aClass.getMethods();
        SEASON autumn = SEASON.SPRING;
        System.out.println(autumn);
        StringBuffer stringBuffer=new StringBuffer();
        final String a="12";
        Son son = new Son();
        System.out.println(son.abc());
    }
}
