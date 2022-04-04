package org.drivemybox.interview.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "greeting.service.type", havingValue = "default", matchIfMissing = true)
public class GreetingDefaultService implements Greeter {

    @Value("${greeting.service.default.greet}")
    private Greeting greeting;

    public String greet(String name) {
        return String.format("%s, %s!", greeting.getGreeting(), name);
    }
}