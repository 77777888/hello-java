package com.haima.arraylist;

import java.util.ArrayList;

public class Demo1Arraylist {
    /*
       集合容器如果没有加入<> 可以存储任意数据类型

        <> 泛型 对存储集合类型限制
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("1434");
        arrayList.add("gjajj");
        System.out.println(arrayList);

        arrayList.add(0,"ihhg");
        System.out.println(arrayList);
    }
}
