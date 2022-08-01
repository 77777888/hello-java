package com.haima.api;


import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {
    /*
        next() : 遇到了空格, 就不再录入数据了

                结束标记: 空格, tab键

        nextLine() : 可以将数据完整的接收过来

                结束标记: 回车换行符
     */

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String s=sc.next();

        System.out.println(s);
    }
}
