package org.hirun.web.controller;

import org.hirun.web.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping
    String get() {
        return userService.get().toString();
    }
}
