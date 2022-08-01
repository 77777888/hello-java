package com.haima.Method;
import java.util.Scanner;
import java.util.Random;

public class  Test8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int week=scanner.nextInt();
        loop:   while(true){
                    if(week>7&week<1){
                        break;
                    }else{
                        switch (week){
                            case 1:
                                System.out.println("跑步");
                                break loop;
                            case 2:
                                System.out.println("游泳");
                                break loop;
                            case 3:
                                System.out.println("慢走");
                                break loop;
                            case 4:
                                System.out.println("动感单车");
                                break loop;
                            case 5:
                                System.out.println("拳击");
                                break loop;
                            case 6:
                                System.out.println("爬山");
                                break loop;
                            case 7:
                                System.out.println("好好吃一顿");
                                break loop;
                            default:
                                System.out.println("您的输入有误");
                                break loop;
                        }

                }
            }

    }
}
