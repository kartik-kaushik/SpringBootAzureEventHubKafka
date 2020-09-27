package com.github.agrajm.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = "${topic.name}")
    public void receive(String message) {
    System.out.println("Received message is=====>"+message);
    }
}
