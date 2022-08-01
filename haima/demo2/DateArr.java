package com.haima.demo2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DateArr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("请输入第"+(i+1)+"个数：");
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}
