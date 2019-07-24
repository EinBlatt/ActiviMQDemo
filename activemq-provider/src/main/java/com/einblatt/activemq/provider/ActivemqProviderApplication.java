package com.einblatt.activemq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqProviderApplication.class, args);
    }
}
