package com.cloudtechmasters;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the Spring Boot application.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootMavenCourseMicroSvcApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        // Test if the application context loads properly
    }

    @Test
    void testGetAllAwsServices() {
        String url = "http://localhost:" + port + "/getAllAwsServices";
        List<String> response = restTemplate.getForObject(url, List.class);

        // Assert the response
        assertThat(response).isNotNull();
        assertThat(response).containsExactly("ec2", "iam", "rds", "ecr", "eks", "s3");
    }

    @Test
    void testGetAllDevopsTools() {
        String url = "http://localhost:" + port + "/getAllDevopsTools";
        List<String> response = restTemplate.getForObject(url, List.class);

        // Assert the response
        assertThat(response).isNotNull();
        assertThat(response).containsExactly("git", "maven", "sonar", "nexus", "jenkins");
    }
}
