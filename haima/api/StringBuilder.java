package com.haima.api;

public class StringBuilder {

    public static void main(String[] args) {
        //method();
        long start=System.currentTimeMillis();
        StringBuffer stringBuilder=new StringBuffer();
        for (int i = 0; i < 5000; i++) {
            stringBuilder.append(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);


    }

    public static void method() {
        long start=System.currentTimeMillis();
        String stringBuilder="";
        for (int i = 0; i < 5000; i++) {
            stringBuilder+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
