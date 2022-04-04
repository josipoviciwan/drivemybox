package org.drivemybox.interview.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greeting.service.default.greet}")
    private Greeting greeting;

    public String greet(String name) {
        return String.format("%s, %s!", greeting.getGreeting(), name);
    }
}