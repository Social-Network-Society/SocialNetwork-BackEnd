package com.codurance.socialnetwork.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SocialNetworkAcceptanceTest {
  public static final String ROOT = "http://localhost:";
  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;


  @Test
  void given_a_posted_message_when_read_command_is_sent_then_message_is_displayed() {
//    this.restTemplate.postForObject(getUrl(""))
    assertThat(
            this.restTemplate.getForObject(getUrl("/hello"),
                    String.class), is("hello"));
  }

  private String getUrl(String uri) {
    return ROOT + port + uri;
  }
}
