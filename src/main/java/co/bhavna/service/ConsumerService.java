package co.bhavna.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    private static final Logger LOG = LoggerFactory.getLogger(ConsumerService.class);
    @KafkaListener( topics = "${spring.kafka.topic-name}")
    public void consume(@Payload String payload){
        LOG.info("Paylaod Received by the Cosumenr APP {} = "+payload);
    }
}
