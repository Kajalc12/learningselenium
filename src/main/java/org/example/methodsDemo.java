package org.example;

public class methodsDemo
{
    public static void main(String[] args){
        methodsDemo d=new methodsDemo();
        String mes=d.getData();
        System.out.println(mes);
        methodsUserDemo d1=new methodsUserDemo();
        String mes1=d1.getData();
        System.out.println(mes1);
        getData1();
//        inside main method method creation is not allowed

    }

    public String getData(){
        System.out.println("Hello, World");
        return "rahul shetty";
    }
    public static void getData1(){
        System.out.println("Hello, World without object creation");
    }
}
