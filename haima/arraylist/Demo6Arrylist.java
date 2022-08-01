package com.haima.arraylist;

import com.haima.domin.Student;

import java.util.ArrayList;

public class Demo6Arrylist {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student student=new Student("张三1",13);
        Student student1=new Student("张三2",24);
        Student student2=new Student("张三3",16);
        Student student3=new Student("张三4",26);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        ArrayList<Student> list1 = getList(list);
        for (int i = 0; i < list1.size(); i++) {
            Student stu = list1.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
    public static ArrayList<Student> getList(ArrayList<Student> list){
        ArrayList<Student> newlist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getAge()<18){
                newlist.add(stu);
            }
        }
        return newlist;
    }
}
