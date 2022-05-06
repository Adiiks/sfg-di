package com.adrian.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World ! - Property";
    }
}
