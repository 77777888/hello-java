package com.haima.demo3;

import java.util.Scanner;

public class Score {
    public static void main(String[] args){
        int [] arr=new int[6];
        Scanner scnner=new Scanner(System.in);
        //录入评委分

        for(int i=0;i<6;i++){
            System.out.print("请输入第"+(i+1)+"个评委的打分:");
            int score=scnner.nextInt();
            if(score>=0&&score<=100){
                arr[i]=score;
            }else{
                System.out.println("您的打分输入有误，请检查是否是0——100之间的");
                i--;//
            }
        }
        //最大值
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //最小值
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //总和
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        //计算平均分
        int avg=(sum-max-min)/4;
        System.out.print(avg);
    }
}
