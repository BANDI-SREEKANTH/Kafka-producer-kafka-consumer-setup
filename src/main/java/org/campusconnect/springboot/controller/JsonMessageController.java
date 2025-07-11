package org.campusconnect.springboot.controller;

import org.apache.catalina.User;
import org.campusconnect.springboot.kafka.JsonKafkaProducer;
import org.campusconnect.springboot.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;
    public JsonMessageController(JsonKafkaProducer kafkaProducer)
    {
        this.kafkaProducer=kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user)
    {
        kafkaProducer.sendMessage((org.campusconnect.springboot.payload.User) user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
