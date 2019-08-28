package com.agrawal.tushar.web.rest;

import com.agrawal.tushar.service.JhipsterTestApplicationKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/jhipster-test-application-kafka")
public class JhipsterTestApplicationKafkaResource {

    private final Logger log = LoggerFactory.getLogger(JhipsterTestApplicationKafkaResource.class);

    private JhipsterTestApplicationKafkaProducer kafkaProducer;

    public JhipsterTestApplicationKafkaResource(JhipsterTestApplicationKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
