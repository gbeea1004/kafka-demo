package com.geonhee.kafkademo.controller;

import com.geonhee.kafkademo.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/kafka")
@RestController
public class KafkaProducerController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/sendMessage")
    public String sendMessage(String message) {
        kafkaProducerService.sendMessage(message);
        return "SUCCESS";
    }
}
