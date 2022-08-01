package com.haima.Method;
    /*
    1：定义方法，名称为print
    2：为方法添加两个int类型的形参，准备接受调用者传递过来的实参
    3：方法中设计for循环，循环从n开始，到m结束
    4：循环中加入if判断，是奇数，则打印
    5：main方法中调用print方法，传入两个实际参数
     */

public class Demo1Method {
    public static void main(String[] args) {
        print(10,20);
    }

    public static void print(int n,int m){
        System.out.println(n+"到"+m+"之间的奇数为:");
        for (int i = n; i <=m ; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
