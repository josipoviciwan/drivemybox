package org.drivemybox.interview.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.ZonedDateTime;

@Service
@ConditionalOnProperty(value = "greeting.service.type", havingValue = "daytime")
public class GreetingDaytimeService implements Greeter {

    private final Clock systemClock;

    @Autowired
    public GreetingDaytimeService(Clock systemClock) {
        this.systemClock = systemClock;
    }

    @Override
    public String greet(String name) {
        return String.format("%s, %s!", daytimeGreeting(), name);
    }

    private String daytimeGreeting() {
        int currentHour = ZonedDateTime.now(systemClock).getHour();

        if (currentHour >= 3 && currentHour < 12) return "Good morning";
        if (currentHour >= 12 && currentHour < 17) return "Good afternoon";
        if (currentHour >= 17 && currentHour < 20) return "Good evening";
        else return "Good night";
    }
}
