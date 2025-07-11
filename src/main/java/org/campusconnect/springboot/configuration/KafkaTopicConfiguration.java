package org.campusconnect.springboot.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic campusConnectTopic()
    {
        return TopicBuilder.name("campus-connect").build();
    }

    @Bean
    public NewTopic campusConnectTopicJson()
    {
        return TopicBuilder.name("campus-connect_json").build();
    }
}
