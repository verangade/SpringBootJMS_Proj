package com.rsoft.test.CodeAssignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	private Integer id;
	private String messageContent;
	
	public Message() {
		super();
	}
	
	
	public Message(Integer id, String  messageContent) {
		super();
		this.id = id;
		this. messageContent =  messageContent;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return  messageContent;
	}
	public void setContent(String  messageContent) {
		this. messageContent =  messageContent;
	}
	
	

}
