package com.haima.Method;

public class Test5 {
    public static void main(String[] args) {
        int [] arr={13,45,44,55,23,89};
        for(int start=0,end=arr.length-1;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
