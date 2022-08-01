package com.haima.demo;
import javafx.scene.shape.ClosePath;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        lop: while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.print("请输入数字：");
            int sc=scanner.nextInt();
            switch (sc){
                case 1:
                    System.out.println("感谢你的使用");
                    break lop;
                case 2:
                    System.out.println("看书");
                    break;
                default:
                    System.out.println("输入有误");
            }
        }
    }
}
