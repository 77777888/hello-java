package com.haima.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random r= new Random();
        int b = r.nextInt(100)+1;
        System.out.println(b);
        while(true) {
            System.out.print("请输入您要猜的数字：");
            int a = scanner.nextInt();
            if (a > b) {
                System.out.println("猜大了");
            } else if (a < b) {
                System.out.println("猜小了");
            } else {
                System.out.println("您猜中了");
                break;
            }
        }
    }
}
