package com.haima.Method;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
    /*
        1.定义一个数组，用静态初始化完成数组元素的初始化
        2.键盘录入要查找的数据，用一个变量接收
        3.定义一个索引变量，初始值为-1
        4.遍历数组，获取到数组中的每一个元素
        5.拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋值给索引变量，并结束循环
        6.输出索引变量
     */

public class Test4 {
    public static void main(String[] args) {
        int []arr= {11,55,87,98,35};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要查找的的元素：");
        int num=scanner.nextInt();
        int index=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(num==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}
