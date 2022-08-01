package com.haima.object2;

public class Student {
    private String name;
    private int age;
    public void setAge(int a){
        if(a>0&&a<120){
            age=a;
        }else{
            System.out.println("您的输入有误");
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(age);
    }

}
