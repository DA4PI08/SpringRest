package com.springrest.listners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "TEST")
    public void testListner(String message){

    }
}
