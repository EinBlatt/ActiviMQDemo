package com.einblatt.activemq.provider.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

@Configuration
public class BeanConfig {


    //注册一个消息队列
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("ActiveMQQueue");
    }


    @Bean
    public Topic topic(){return new ActiveMQTopic("ActiveTopic");}



}
