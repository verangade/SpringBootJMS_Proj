package com.rsoft.test.CodeAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsoft.test.CodeAssignment.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
