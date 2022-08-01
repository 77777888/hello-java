package com.haima.object;

public class   TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=18;
        student.name="哈喽";
        student.study("英语");
        System.out.println(student.age);
        System.out.println(student.name);

    }
}
