package com.haima.Method;
    /*
    方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载

    - 多个方法在同一个类中
    - 多个方法具有相同的方法名
    - 多个方法的参数不相同，类型不同或者数量不同

     */

public class MethodDemo {
    /*
    - 需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
- 思路：
  	①定义比较两个数字的是否相同的方法compare()方法，参数选择两个int型参数
  	②定义对应的重载方法，变更对应的参数类型，参数变更为两个long型参数
  	③定义所有的重载方法，两个byte类型与两个short类型参数
  	④完成方法的调用，测试运行结果

     */
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)10));
        System.out.println(compare((short)10,(short)20));
    }
    public static boolean compare(int a,int b){
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
}
