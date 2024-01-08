package com.prashant.customer_service.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prashant.customer_service.entity.Message;
import com.prashant.customer_service.repository.MessageRepository;
import com.prashant.customer_service.service.AgentService;

@Controller
@RequestMapping("/agent")
public class AgentController {
	
	@Autowired
	AgentService agentService;

    @GetMapping("/dashboard")
    public String agentDashboard(Model model) {
    	List<Message> allMessages = agentService.getAllMessages();
        model.addAttribute("allMessages", allMessages);
        
        return "agent_dashboard";
    }

    @PostMapping("/reply")
    public String replyToMessage(@RequestParam int messageId, @RequestParam String reply) {
        agentService.findById(messageId, reply);
        
        return "redirect:/agent/dashboard";
    }
}
