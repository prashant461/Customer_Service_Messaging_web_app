package com.prashant.customer_service.entity;


import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
		
}
