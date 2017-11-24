package com.ziongospelhall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	@RequestMapping("/events")
	public String getAllEvents() {
		return "Zion Gospel Hall Events...";
	}
}
