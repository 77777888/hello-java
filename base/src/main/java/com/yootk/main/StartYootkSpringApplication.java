package com.yootk.main;

import com.yootk.service.IMessageService;
import com.yootk.service.impl.MessageServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartYootkSpringApplication {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-base.xml");//加载配置文件
        IMessageService messagerService = context.getBean("messagerService", MessageServiceImpl.class);//获取实例化对象
        System.out.println(messagerService.echo("沐言科技：www.yootk.com"));
    }
}
