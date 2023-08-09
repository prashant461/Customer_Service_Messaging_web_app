package com.prashant.customer_service.entity;


import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {
	@Id
	@Column(name = "message_id")
    private int messageId;

	@Column(name = "user_id")
    private int userId;

    @Column(name = "time_stamp")
    private Instant timestamp;

    @Column(name = "message_body", length = 1000)
    private String messageBody;

	@Column(name = "agent")
    private boolean agent = false;
	
	@Column(name="reply")
    private String reply;
	
	
	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Instant getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timestamp = timeStamp;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public boolean isAgent() {
		return agent;
	}

	public void setAgent(boolean agent) {
		this.agent = agent;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}


	
}
