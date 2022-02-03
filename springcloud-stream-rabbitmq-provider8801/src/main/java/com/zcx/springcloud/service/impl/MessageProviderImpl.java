package com.zcx.springcloud.service.impl;

import com.zcx.springcloud.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;

import java.util.UUID;

/**
 * @auther zzyy
 * @create 2020-02-22 10:56
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements MessageProvider
{
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        return serial;
    }
}
