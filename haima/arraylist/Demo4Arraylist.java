package com.haima.arraylist;

import com.haima.domin.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4Arraylist {
    public static void main(String[] args) {
        ArrayList<Student> arrayList =new ArrayList<>();
        Student stu1 = setStudent();
        Student stu2 = setStudent();
        Student stu3 = setStudent();
        Student stu4 = setStudent();
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        arrayList.add(stu4);
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }

    }

    public static Student setStudent() {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age=sc.nextInt();
        Student stu1=new Student(name,age);
        return stu1;
    }
}
