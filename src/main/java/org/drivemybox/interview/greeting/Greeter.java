package org.drivemybox.interview.greeting;

import org.springframework.stereotype.Component;

@Component
public interface Greeter {

    String greet(String name);
}