package com.rsoft.test.CodeAssignment.listner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.rsoft.test.CodeAssignment.repository.MessageRepository;

@Component
public class Consumer {
	
	@Autowired
	private MessageRepository repo;

	@JmsListener(destination = "inmemqueue")
	public void listner(String message) {
		System.out.println(message);
		//CR
	}
}
