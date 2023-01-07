package com.example.helloapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloHTTPRequest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void checkStringMatches() throws Exception{
        assertThat(restTemplate.getForObject("http://localhost:"+port+"/",String.class)).contains("Hello Spring!");
    }
    @Test
    public void checkStringMatchesBye() throws Exception{
        assertThat(restTemplate.getForObject("http://localhost:"+port+"/bye",String.class)).contains("Good Bye Spring!");
    }
}
