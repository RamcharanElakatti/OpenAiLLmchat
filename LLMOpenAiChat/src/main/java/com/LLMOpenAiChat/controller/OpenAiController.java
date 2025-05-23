package com.LLMOpenAiChat.controller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin("*")
public class OpenAiController {
	
	  private OpenAiChatModel chatModel;

	public OpenAiController(OpenAiChatModel chatModel) {
		super();
		this.chatModel = chatModel;
	}
	
	@GetMapping("/{message}")
	public ResponseEntity<String> getAnswer(@PathVariable String message){
        String response = chatModel.call(message);
        return ResponseEntity.ok(response);
	}
	

}
