# spring-boot-kafka
Spring Boot App for Kafka - learning how Kafka and/or Event Hubs can be used with Spring Boot to send & recieve messages ! 

# Configuration
Whether you are connecting to Kafka or Event Hub, you would need to configure your Spring Boot app 

If you are using Event Hub, following configuration can work:

```
  server:
    port: 9000
  spring:
    kafka:
      bootstrap-servers: <EHNamespace>.servicebus.windows.net:9093
      properties:
        sasl.jaas.config: org.apache.kafka.common.security.plain.PlainLoginModule required username="$ConnectionString" password="<EH_CONNECTION_STRING>";
        sasl.mechanism: PLAIN
        security.protocol: SASL_SSL
      producer:
        value-serializer: com.github.agrajm.serializers.ProducerSerializer
      consumer:
        group-id: $Default
        properties:
          spring.json:
            use.headers.type: false
            value.default.type: com.github.agrajm.models.SimpleMessage
  topic:
    name: simplemessage
```

The EH must be in Standard or Premium Tier. For Basic Tier, EH does not support Kafka. 