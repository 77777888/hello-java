package com.haima.Method;

public class Test3 {
    public static void main(String[] args) {
        int [] arr={11,44,64,32};
        int [] maxAndmin=getMaxAndMin(arr);
        System.out.println(maxAndmin[0]);
        System.out.println(maxAndmin[1]);

    }
    public static int[] getMaxAndMin(int []arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int []maxAndmin={max,min};
        return maxAndmin;
    }
}
