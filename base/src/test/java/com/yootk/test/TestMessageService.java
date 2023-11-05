package com.yootk.test;

import com.yootk.service.IMessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(locations={"classpath:spring/spring-base.xml"})
@ExtendWith(SpringExtension.class)
public class TestMessageService {
    public static final Logger LOGGER= LoggerFactory.getLogger(TestMessageService.class);//日志记录
    @Autowired   //自动注入bean实例
    private IMessageService messageService;
    @Test
    public void testEcho() throws Exception{
        LOGGER.info("echo() 调试测试: {}",this.messageService.echo("沐言科技：www.yootk.com"));
        LOGGER.warn("echo() 调试测试: {}",this.messageService.echo("沐言科技：www.yootk.com"));
        LOGGER.error("echo() 调试测试: {}",this.messageService.echo("沐言科技：www.yootk.com"));
        LOGGER.debug("echo() 调试测试: {}",this.messageService.echo("沐言科技：www.yootk.com"));

    }

}
