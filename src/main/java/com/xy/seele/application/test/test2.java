package com.xy.seele.application.test;

public class test2 {
    public void method(laminter la){
        la.run("ffd");
    }
    public static void main(String[] args) {
        //值传递
        int a=8;
        Son son = new Son();
        son.setAge(8);
        count(a,son);
        System.out.println("基本数据类型"+a+"：引用类型"+son.getAge());
        //匿名内部类
        laminter lambda = new laminter() {
            public void run(String a) {
                System.out.println("test 匿名内部类");
            }
        };
        lambda.run("fd");
        //lambda
        test2 test = new test2();
        test.method(s-> System.out.println("lambda"));

    }

    private static void count(int a,Son son) {
        son.setAge(23);
        a+=1;
    }
}
