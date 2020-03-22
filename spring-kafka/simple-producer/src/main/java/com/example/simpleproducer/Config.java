package com.example.simpleproducer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.autoconfigure.kafka.ConcurrentKafkaListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;

@Configuration
public class Config {

    public static final String TOPIC = "messages";

    // Spring Boot Apache Kafka Support
    // https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-kafka

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
