package com.haima.object;

public class Phone {
    String brand;
    int price;
    public void sendMessage(String name){
        System.out.println("给"+name+"发短信");
    }
    public void call(){
        System.out.println("打电话");
    }
}
