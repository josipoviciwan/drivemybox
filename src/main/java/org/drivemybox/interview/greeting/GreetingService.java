package org.drivemybox.interview.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return String.format("Hi, %s!", name);
    }
}