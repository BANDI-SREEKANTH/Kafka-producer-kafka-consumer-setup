package org.campusconnect.springboot.controller;

import org.campusconnect.springboot.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/campusconnect")
public class MessageController {
    private KafkaProducer kafkaProducer;
    public MessageController(KafkaProducer kafkaProducer)
    {
        this.kafkaProducer=kafkaProducer;
    }

    //localhost:8080/api/v1/campusconnect/publish?message=hello-world
    // lets create Rest API end points
    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message)
    {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
