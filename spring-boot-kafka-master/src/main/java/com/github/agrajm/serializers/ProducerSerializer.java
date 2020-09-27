package com.github.agrajm.serializers;

import com.github.agrajm.models.SimpleMessage;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerSerializer extends JsonSerializer<SimpleMessage> {
  
}