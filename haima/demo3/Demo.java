package com.haima.demo3;

public class Demo {
    public static void main(String[] args) {
        int [] arr={11,22,44,55};
        GetArr(arr);
        System.out.println("代码结束");

    }
    public static void GetArr(int [] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
