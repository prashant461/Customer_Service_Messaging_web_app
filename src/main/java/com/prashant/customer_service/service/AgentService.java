package com.prashant.customer_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.customer_service.entity.Message;
import com.prashant.customer_service.repository.MessageRepository;

@Service
public class AgentService {
	@Autowired
    private MessageRepository messageRepository;
	
	
	public List<Message> getAllMessages() {
		
		List<Message> allMessages = messageRepository.findAllByAgentFalseOrderByTimestampDesc();
		
		return allMessages;
	}


	public void findById(int messageId, String reply) {
		
		Optional<Message> messageOptional = messageRepository.findById(messageId);
		
		if (messageOptional.isPresent()) {
            Message message = messageOptional.get();
            message.setAgent(true);
            message.setReply(reply);
            messageRepository.save(message);
        }
	}
	
	
	

}
