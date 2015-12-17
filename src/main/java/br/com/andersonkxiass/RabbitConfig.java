package br.com.andersonkxiass;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;

@Configuration
public class RabbitConfig {
		
	@Bean
	Queue queueMessage() {
		return new Queue("queue.message", false);
	}
	
	@Bean
	Queue queueMessages() {
		return new Queue("queue.messages", false);
	}
	
	@Bean
	TopicExchange exchange() {
		return new TopicExchange("exchange");
	}

	@Bean
	Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage).to(exchange).with("queue.message");
	}

	@Bean
	Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessages).to(exchange).with("queue.messages");
	}
	
	@Bean
	public MappingJackson2MessageConverter jackson2Converter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		return converter;
	}
}