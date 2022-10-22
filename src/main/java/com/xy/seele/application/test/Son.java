package com.xy.seele.application.test;

public class Son extends Father {
    private String name;
    private int age;
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("finish");
    }
    @Override
    public String abc(){
        return "son abc" ;
    }

    public String Son() {
        return "son";
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
