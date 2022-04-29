package com.adrian.sfgdi.controllers;

import com.adrian.sfgdi.services.GreetingService;

public class ConstructedInjectedController {

    private final GreetingService greetingService;

    public ConstructedInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
