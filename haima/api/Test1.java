package com.haima.api;

import java.util.Scanner;

public class Test1 {
        /*
        需求：已知用户名和密码，请用程序实现模拟用户登录。
              总共给三次机会，登录之后，给出相应的提示

        思路：
        1. 已知用户名和密码，定义两个字符串表示即可
        2. 键盘录入要登录的用户名和密码，用 Scanner 实现
        3. 拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。
            字符串的内容比较，用equals() 方法实现
        4. 用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环

     */
        public static void main(String[] args) {
            // 1. 已知用户名和密码，定义两个字符串表示即可
            String username="admin";
            String password="a111111";

            //2. 键盘录入要登录的用户名和密码，用 Scanner 实现
            Scanner scanner=new Scanner(System.in);
            //4. 用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
            for (int i = 1; i <=3 ; i++) {
                System.out.println("请输入用户名：");
                String scusername=scanner.nextLine();
                System.out.println("请输入密码：");
                String scpassworld=scanner.nextLine();
                //3. 拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。
                //            字符串的内容比较，用equals() 方法实现
                if(username.equals(scusername)&&password.equals(scpassworld)){
                    System.out.println("登录成功");
                    break;
                }else {
                    if(i==3){
                        System.out.println("您今天的次数已用完,请明天登录");
                    }else{
                        System.out.println("登陆失败,您还剩"+(3-i)+"次机会");
                    }

                }

            }


        }
}
