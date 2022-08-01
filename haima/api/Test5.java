package com.haima.api;

import com.sun.corba.se.impl.orb.PrefixParserAction;

import java.util.Scanner;

public class Test5 {
    /*
    需求：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换

    思路：
    1. 键盘录入一个字符串，用 Scanner 实现
    2. 替换敏感词
            String replace(CharSequence target, CharSequence replacement)
            将当前字符串中的target内容，使用replacement进行替换，返回新的字符串
    3. 输出结果

    */
    public static void main(String[] args) {
        Scanner scnner=new Scanner(System.in);
        System.out.println("请输入:");
        String sc=scnner.nextLine();

        String s=sc.replace("TMD","***");

        System.out.println(s);
    }
}
