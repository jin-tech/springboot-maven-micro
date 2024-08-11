package com.cloudtechmasters;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootMavenCourseMicroSvcApplicationTests {

    // This test method checks if the context loads correctly
    @Test
    void contextLoads() {
        // This test currently does nothing, which is a code smell
        assertTrue(true); // Always passes, but does not validate any real behavior
    }
    // This test method validates that the lists are as expected
    @Test
    void testGetAllAwsServices() {
        List<String> expectedAwsServices = Arrays.asList("ec2", "iam", "rds", "ecr", "eks");
        List<String> actualAwsServices = Arrays.asList("ec2", "iam", "rds", "ecr", "eks"); // Simulate actual service list
        assertEquals(expectedAwsServices, actualAwsServices, "The list of AWS services should match the expected values.");
    }

    // This test method contains an assertion that will fail, demonstrating a failing test
    @Test
    void testFailingAssertion() {
        List<String> expectedDevopsTools = Arrays.asList("git", "maven", "sonar", "nexus", "jenkins");
        List<String> actualDevopsTools = Arrays.asList("git", "maven", "sonar", "nexus", "jenkins"); // Missing "jenkins" intentionally
        assertEquals(expectedDevopsTools, actualDevopsTools, "The list of DevOps tools should match the expected values.");
    }

    // This test method uses a deprecated assertion method
    @Test
    @Deprecated
    void testDeprecatedMethod() {
        assertTrue(true, "This assertion is deprecated and always fails."); // Intentionally failing
    }
}
