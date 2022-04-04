package org.drivemybox.interview.greeting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingDaytimeServiceTest {
    @Test
    @DisplayName("Should greet with morning at 03:00am")
    public void greetMorningMin() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T03:00:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good morning, John!", greetingDaytimeService.greet("John"));

    }

    @Test
    @DisplayName("Should greet with morning at 07:30am")
    public void greetMorningMid() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T07:30:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good morning, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with morning at 11:59am")
    public void greetMorningMax() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T11:59:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good morning, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with afternoon at 12:00pm")
    public void greetAfternoonMin() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T12:00:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good afternoon, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with afternoon at 02:30pm")
    public void greetAfternoonMid() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T14:30:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good afternoon, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with afternoon at 04:59pm")
    public void greetAfternoonMax() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T16:59:00Z"),
                ZoneOffset.UTC
        );

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good afternoon, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with evening at 05:00pm")
    public void greetEveningMin() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T17:00:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good evening, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with evening at 06:30pm")
    public void greetEveningMid() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T18:30:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good evening, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with evening at 07:59pm")
    public void greetEveningMax() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T19:59:00Z"),
                ZoneOffset.UTC
        );

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good evening, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with night at 08:00pm")
    public void greetNightMin() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T20:00:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good night, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with night at 11:30pm")
    public void greetNightMid() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T23:30:00Z"),
                ZoneOffset.UTC);

        GreetingDaytimeService greetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good night, John!", greetingDaytimeService.greet("John"));
    }

    @Test
    @DisplayName("Should greet with night at 02:59am")
    public void greetNightMax() {
        Clock testClock = Clock.fixed(
                Instant.parse("2022-01-01T02:59:00Z"),
                ZoneOffset.UTC
        );

        GreetingDaytimeService GreetingDaytimeService = new GreetingDaytimeService(testClock);

        assertEquals("Good night, John!", GreetingDaytimeService.greet("John"));
    }
}
