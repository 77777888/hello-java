package com.haima.arraylist;


import com.haima.domin.StudentTest6;

import java.util.ArrayList;

public class Demo3Araylist {
    public static void main(String[] args) {
        ArrayList <StudentTest6> arrayList=new ArrayList<>();

        StudentTest6 studentTest6= new StudentTest6("哈喽1","23");
        StudentTest6 studentTest7= new StudentTest6("哈喽2","24");
        StudentTest6 studentTest8= new StudentTest6("哈喽3","25");
        arrayList.add(studentTest6);
        arrayList.add(studentTest7);
        arrayList.add(studentTest8);

        for (int i = 0; i < arrayList.size(); i++) {
            StudentTest6 studentTest61 = arrayList.get(i);
            System.out.println(studentTest61.getName()+"..."+studentTest61.getAge());
        }
    }
}
