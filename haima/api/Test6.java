package com.haima.api;

import com.haima.domin.StudentTest6;

import java.util.Scanner;

public class Test6 {
    /*
     需求：以字符串的形式从键盘录入学生信息，例如：“张三 , 23”
            从该字符串中切割出有效数据,封装为Student学生对象
     思路：
        1. 编写Student类，用于封装数据
        2. 键盘录入一个字符串，用 Scanner 实现
        3. 根据逗号切割字符串，得到（张三）（23）
                String[] split(String regex) ：根据传入的字符串作为规则进行切割
                将切割后的内容存入字符串数组中，并将字符串数组返回
        4. 从得到的字符串数组中取出元素内容，通过Student类的有参构造方法封装为对象
        5. 调用对象getXxx方法，取出数据并打印。

    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        //2. 键盘录入一个字符串，用 Scanner 实现
        String sc=scanner.nextLine();
        //4. 从得到的字符串数组中取出元素内容，通过Student类的有参构造方法封装为对象
        String [] strs=sc.split(",");

        StudentTest6 studentTest6=new StudentTest6(strs[0],strs[1]);
        //5. 调用对象getXxx方法，取出数据并打印
        System.out.println(studentTest6.getName()+"..."+studentTest6.getAge());
    }

}
