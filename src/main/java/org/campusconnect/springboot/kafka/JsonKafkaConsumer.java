package org.campusconnect.springboot.kafka;
import org.campusconnect.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "campus-connect_json")
    public void consumer(User user)
    {
        LOGGER.info(String.format("Json message received to consumer : %s",user.toString()));
    }

}
