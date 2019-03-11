package com.barry.order.services;

import org.springframework.context.annotation.Configuration;

public class KafkaSenderConfig {
/*    
    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

    @Bean
    public ProducerFactory<String, Foo> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, Foo> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

*/
}