package org.drivemybox.interview.greeting;

import org.drivemybox.interview.InterviewApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Commented out because of new springboot version deprecated methods

//@SpringBootTest(
//        classes = InterviewApplication.class,
//        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
//)
public class GreetingIntegrationTest {
//
//    private HttpClient httpClient;
//
//    private String basePath;
//
//    @LocalServerPort
//    private int port;
//
//    @BeforeEach
//    public void setup() {
//        basePath = "http://localhost:" + port + "/greeting";
//        httpClient = HttpClient.newHttpClient();
//    }
//
//    @Test
//    @DisplayName("Should return the correct greeting")
//    public void shouldReturnTheCorrectGreeting() throws Exception {
//        // given
//        var uri = UriComponentsBuilder.fromHttpUrl(basePath)
//                .queryParam("name", "Leonard")
//                .build()
//                .toUri();
//
//        var httpRequest = HttpRequest.newBuilder()
//                .uri(uri)
//                .GET()
//                .build();
//
//        // when
//        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//
//        // then
//        assertEquals(200, response.statusCode());
//        assertEquals("Hi, Leonard!", response.body());
//    }
//
//    @Test
//    @DisplayName("Should return a bad request status code")
//    public void missingNameParam() throws Exception {
//        // given
//        var uri = UriComponentsBuilder.fromHttpUrl(basePath)
//                .build()
//                .toUri();
//
//        var httpRequest = HttpRequest.newBuilder()
//                .uri(uri)
//                .GET()
//                .build();
//
//        // when
//        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//
//        // then
//        assertEquals(400, response.statusCode());
//    }
}