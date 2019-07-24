package com.einblatt.activemq.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

@RestController
public class ProviderController {

    //注入Queue
    @Resource
    private Queue queue;

    @Resource
    private Topic topic;

    //注入springboot 自己提供的工具类
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sendqueue")
    public void sendQueue(String name){
        //将消息发送至队列queue信息为name
        jmsMessagingTemplate.convertAndSend(queue,name);
        System.out.println("发送信息成功!");
    }

    @RequestMapping("/sendtopic")
    public void sendTopic(String name){
        jmsMessagingTemplate.convertAndSend(topic,name);
        System.out.println("发送信息topic成功!");
    }




}
