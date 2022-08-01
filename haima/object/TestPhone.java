package com.haima.object;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="华为";
        phone.price=1000;
        phone.sendMessage("halou");
        phone.call();
        System.out.println(phone.brand);
        System.out.println(phone.price);
    }
}
