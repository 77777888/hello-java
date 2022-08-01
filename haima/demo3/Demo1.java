package com.haima.demo3;

public class Demo1 {
    public static void main(String[] args) {
        isEvenNumber(0);
    }
    public static void isEvenNumber(int num){
        if(num%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
