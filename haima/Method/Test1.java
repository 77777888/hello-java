package com.haima.Method;

public class Test1 {
    public static void main(String[] args) {
        int number=100;
        System.out.println("调用change方法前"+number);
        change(200);
        System.out.println("调用change方法后"+number);


    }
    public static void change(int number){
        number=200;
    }
}
