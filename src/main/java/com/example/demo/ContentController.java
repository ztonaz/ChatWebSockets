package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ContentController {

	@MessageMapping ("/receive")
	@SendTo ("/topic/nicknameandmessage")
	public Chat chat (TheNickname nickname, TheMessage message) {
		
		MyUnicode uni = new MyUnicode();
		
		String lol = uni.getTheBold(nickname.getNickname());
		
		
		return new Chat(HtmlUtils.htmlEscape(lol + " : " + message.getMessage()));
		
	}
	
	
}
