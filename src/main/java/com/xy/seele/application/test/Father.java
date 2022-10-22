package com.xy.seele.application.test;

public class Father extends Thread{
    public String abc(String a){
        return "123";
    }
    public String abc(){
        return "fa abc";
    }

    public String Father() {
        return "";
    }
    public String Son() {
        return "father";
    }
//    @Override
//    public void run() {
//        try {
//            Class<?> aClass = Class.forName("com.xy.seele.application.test.SEASON");
//            aClass.getConstructor();
//            aClass.getField("SPRING");
//            aClass.getMethods();
//        } catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//
//
//    }
}
