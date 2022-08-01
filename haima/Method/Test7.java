package com.haima.Method;

public class Test7 {
    public static void main(String[] args) {
        int [][] arr={{22,33,55,66},{55,77,88,99}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
