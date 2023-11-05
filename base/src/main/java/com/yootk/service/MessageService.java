package com.yootk.service;

import com.yootk.config.MessageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService implements AutoCloseable    {//自动关闭
    public static final Logger LOGGER= LoggerFactory.getLogger(MessageService.class);
    private MessageConfig config;

    private boolean connect(){
        LOGGER.info("连接服务器：{}{}",this.config.getHost(),this.config.getPort());
        return this.config.isEnable();
    }

    @Override
    public void close() throws Exception {

    }
}
