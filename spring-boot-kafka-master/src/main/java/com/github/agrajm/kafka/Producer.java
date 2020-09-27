package com.github.agrajm.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.github.agrajm.models.SimpleMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Producer {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;

    public void send(String message) {
        this.kafkaTemplate.send(topicName, message);
        System.out.println("topic name is ==>"+topicName);
        System.out.println("Published message in producer is ==>"+message);
        
        //log.info("Published the message [{}] to the kafka queue: [{}]",
        //        message,
        //        topicName
        //);
    }
}
