package com.prashant.customer_service.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prashant.customer_service.entity.Message;
import com.prashant.customer_service.repository.MessageRepository;
import com.prashant.customer_service.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@GetMapping("/")
	public String showUserIdForm() {
		
		return "user_id_form";
	}

	@PostMapping("/redirect")
	public String redirectToUserDashboard(@RequestParam int userId) {
		
	    return "redirect:/user/" + userId + "/dashboard";
	}

    @GetMapping("/{userId}/dashboard")
    public String userDashboard(Model model, @PathVariable int userId) {
    	
        List<Message> agentReply = userService.getAgentReply(userId);
        
        model.addAttribute("agentReply", agentReply);
        return "user_dashboard";
    }

    @PostMapping("/send")
    public String sendUserMessage(RedirectAttributes redirectAttributes,@RequestParam int userId, @RequestParam String messageBody) {
    	
    	userService.sendMessage(userId, messageBody);
        
        redirectAttributes.addAttribute("userId", userId);
        return "redirect:/user/{userId}/dashboard";
    }
}
