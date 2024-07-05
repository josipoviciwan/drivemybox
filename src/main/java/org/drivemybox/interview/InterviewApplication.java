package org.drivemybox.interview;

import org.drivemybox.interview.greeting.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.time.Clock;

// Directly import to reduce loading times
@Import({ GreetingController.class })
@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

    @Bean
    public Clock systemClockDefaultZone() {
        return Clock.systemDefaultZone();
    }
}