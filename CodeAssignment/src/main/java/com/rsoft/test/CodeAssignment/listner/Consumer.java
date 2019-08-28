package com.rsoft.test.CodeAssignment.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "inmemqueue")
	public void listner(String message) {
		System.out.println(message);
	}
}
