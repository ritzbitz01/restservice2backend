package com.rbp.simplespring.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbp.simplespring.restservice.model.MessageData;
import com.rbp.simplespring.restservice.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	MessageService messageService;

	public MessageController() {

	}

	@RequestMapping("/")
	public MessageData saveMessageData(@RequestBody MessageData data) {

		return messageService.saveMessageData(data);
	}
}
