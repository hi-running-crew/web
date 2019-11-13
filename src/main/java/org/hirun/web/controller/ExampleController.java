package org.hirun.web.controller;

import org.hirun.web.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ExampleController {

	private final UserService userService;

	@GetMapping
	String test() {
		return userService.get().getName();
	}
}
