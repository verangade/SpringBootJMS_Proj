package com.rsoft.test.CodeAssignment.resource;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/produce")
@RestController
public class ProduceResource {
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@GetMapping("/message")
	public String publishMessageToQUeue() {
		jmsTemplate.convertAndSend(queue, "Hello World");
		return "Message Published";
	}

}
