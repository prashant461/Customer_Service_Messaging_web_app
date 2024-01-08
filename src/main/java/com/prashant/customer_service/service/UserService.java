package com.prashant.customer_service.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.customer_service.entity.Message;
import com.prashant.customer_service.repository.MessageRepository;


@Service
public class UserService {
	
	@Autowired
	private MessageRepository messageRepository;

	public List<Message> getAgentReply(int userId) {
		List<Message> agentReply = messageRepository.findByUserIdOrderByTimestampDesc(userId);
		
		return agentReply;
	}

	public void sendMessage(int userId, String messageBody) {
		
		Message message = new Message();
        message.setUserId(userId);
        message.setMessageBody(messageBody);
        message.setTimestamp(Instant.now());
        message.setAgent(false);
        messageRepository.save(message);
	}

	

}
