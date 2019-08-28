package com.rsoft.test.CodeAssignment.config;


import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class JMSConfig {

	@Bean
	public Queue name() {
		return new ActiveMQQueue("inmemqueue");
	}
}
