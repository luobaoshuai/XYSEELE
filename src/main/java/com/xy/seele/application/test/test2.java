package com.xy.seele.application.test;

public class test2 extends Thread{
    public static void main(String[] args) {
        //值传递
        int a=8;
        Son son = new Son();
        boolean f=son instanceof Father;
        son.setAge(8);
        count(a,son);
        System.out.println("基本数据类型" +a+"：引用类型"+son.getAge());
        //匿名内部类
        laminter lambda = new laminter() {
            public void run(int a) {
                System.out.println("test 匿名内部类");
            }
        };
        lambda.run(a);
        //lambda
        lambda=b-> System.out.println("lambda");
        lambda.run(a);


    }

    private static void count(int a,Son son) {
        son.setAge(23);
        a+=1;
    }
}
