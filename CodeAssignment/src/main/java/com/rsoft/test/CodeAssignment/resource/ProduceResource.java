package com.rsoft.test.CodeAssignment.resource;

import java.util.List;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsoft.test.CodeAssignment.model.Message;
import com.rsoft.test.CodeAssignment.repository.MessageRepository;

@RequestMapping("/produce")
@RestController
public class ProduceResource {
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private MessageRepository messageRepository;
	
	@GetMapping("/messages/{content}")
	public String publishMessageToQUeue(@PathVariable String content) {
		jmsTemplate.convertAndSend(queue, content);
		return "Message Published";
	}
	
	
	@GetMapping("/messages/all")
	public List<Message> retrieveAllMessage() {
		return messageRepository.findAll();
	}

}
