package com.geonhee.kafkademo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "sendMessage", groupId = "group-id-kafka")
    public void consume(String message) {
        log.info("producer 로 부터 받은 메시지 : {}", message);
    }
}
