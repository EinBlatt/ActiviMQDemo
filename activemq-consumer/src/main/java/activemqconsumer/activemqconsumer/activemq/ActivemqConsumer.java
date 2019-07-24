package activemqconsumer.activemqconsumer.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActivemqConsumer {

    /**
     * 消费者  消费队列
     */
    @JmsListener(destination = "ActiveMQQueue",containerFactory = "queueListenerFactory")
    public  void consumeAc(String consumer){
        System.out.println("消费者1(Queue): 消费ActiveMQQueue消息为:"+consumer);
    }

    @JmsListener(destination = "ActiveMQQueue",containerFactory = "queueListenerFactory")
    public  void consumeAc2(String consumer){
        System.out.println("消费者2(Queue):   消费ActiveMQQueue消息为:"+consumer);
    }

    @JmsListener(destination = "ActiveTopic",containerFactory = "topicListenerFactory")
    public void consumeTo(String comment){
        System.out.println("消费者1(Topic):   消费ActiveMQTopic消息为:"+comment);
    }


    @JmsListener(destination = "ActiveTopic",containerFactory = "topicListenerFactory")
    public void consumeTo2(String commnet){
        System.out.println("消费者2(Topic):   消费ActiveMQTopic消息为:"+commnet);
    }

}
