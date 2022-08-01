package com.haima.Method;
    /*
            需求：设计一个方法可以获取两个数的较大值，数据来自于参数

        1. 定义一个方法，声明两个形参接收计算的数值，求出结果并返回
        2. 使用 if 语句 得出 a 和 b 之间的最大值，根据情况return具体结果
        3. 在main()方法中调用定义好的方法并使用 【 变量保存 】
     */

public class Demo2Method {
    public static void main(String[] args) {
        int result=getMax(10,20);
        System.out.println(result);
        for (int i = 1; i <result ; i++) {
            System.out.println("helloworld");
        }
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

}
