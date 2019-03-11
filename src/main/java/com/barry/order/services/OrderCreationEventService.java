package com.barry.order.services;

import com.barry.order.entities.Order;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderCreationEventService {
    
    private String TOPIC = "test";

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void createOrderEvent(Order order){
        ProducerRecord<String, Order> message = new ProducerRecord<String,Order>(TOPIC, order); 
        this.kafkaTemplate.send(message);

    }

}
