package com.prashant.customer_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashant.customer_service.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

	List<Message> findAllByAgentFalseOrderByTimestampDesc();

	List<Message> findByUserIdOrderByTimestampDesc(int userId);

}
