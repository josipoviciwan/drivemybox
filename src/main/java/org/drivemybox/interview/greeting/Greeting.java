package org.drivemybox.interview.greeting;

public enum Greeting {
    HELLO("Hello"),
    HEY("Hey"),
    HI("Hi"),
    ;

    private final String greeting;

    Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}