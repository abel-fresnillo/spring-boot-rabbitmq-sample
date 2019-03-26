package dev.abel.rabbitmqsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    MessageRepository repository;

    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
        repository.save(new Message(message));
        System.out.println("Message Saved to MongoDB");
    }
}
