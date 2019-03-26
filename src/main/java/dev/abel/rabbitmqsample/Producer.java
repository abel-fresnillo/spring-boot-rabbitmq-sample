package dev.abel.rabbitmqsample;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner {
    private final Consumer consumer;
    private final RabbitTemplate rabbitTemplate;

    public Producer(Consumer consumer, RabbitTemplate rabbitTemplate) {
        this.consumer = consumer;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(SpringBootRabbitmqSampleApplication.topicExchangeName, "dev.abel", "Testing Sample App");
    }

}
