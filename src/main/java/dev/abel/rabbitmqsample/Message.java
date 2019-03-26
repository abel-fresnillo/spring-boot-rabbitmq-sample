package dev.abel.rabbitmqsample;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Message {
    @Id
    private String id;
    private String body;

    public Message(String body) {
        this.body = body;
    }
}
