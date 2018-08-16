package com.javainuse.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;	
@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = "java_in_use_topic")
    public void listen(@Payload String message) {
        System.out.println("received message:"+message);
    }
}
