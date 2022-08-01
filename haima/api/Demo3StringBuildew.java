package com.haima.api;

public class Demo3StringBuildew {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("你好胖").append("jkjjg");
        stringBuffer.append("halou");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.length());

        String s=stringBuffer.toString();
        System.out.println(s);

    }
}
