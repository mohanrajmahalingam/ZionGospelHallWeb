package com.ziongospelhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ziongospelhall.entry.Test;
import com.ziongospelhall.service.TestService;

@RestController
public class EventController {
	@Autowired
	private TestService testService;

	@RequestMapping("/events")
	public String getAllEvents() {
		return "Zion Gospel Hall Events...";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addTest(@RequestBody Test test) {
		testService.test(test);
	}
}
