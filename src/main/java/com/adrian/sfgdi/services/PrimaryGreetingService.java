package com.adrian.sfgdi.services;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World ! - Primary";
    }
}
