package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Controller for handling course-related endpoints.
 */
@RestController
public class CourseController {

    /**
     * Endpoint to retrieve a list of AWS services.
     *
     * @return A list of AWS services.
     */
    @GetMapping("/getAllAwsServices")
    public List<String> getAllAwsServices() {
        // Using a mutable list to avoid UnsupportedOperationException
        List<String> awsServices = new ArrayList<>(Arrays.asList("ec2", "iam", "rds", "ecr", "eks"));
        awsServices.add("s3"); // Adding an additional service
        return awsServices;
    }

    /**
     * Endpoint to retrieve a list of DevOps tools.
     *
     * @return A list of DevOps tools.
     */
    @GetMapping("/getAllDevopsTools")
    public List<String> getAllDevopsTools() {
        // Using a mutable list to provide more flexibility
        return new ArrayList<>(Arrays.asList("git", "maven", "sonar", "nexus", "jenkins"));
    }
}
