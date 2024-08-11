package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// This class has no JavaDoc, which is a code smell
@RestController
public class CourseController {
    //create two endpoints getAllAwsServices and getAllDevopsTools
    @GetMapping("/getAllAwsServices")
    public List<String> getAllAwsServices(){
        // This code could potentially cause a NullPointerException if the list is modified elsewhere
        List<String> awsServices = Arrays.asList("ec2", "iam", "rds", "ecr", "eks");
        awsServices.add("s3"); // Issue: Arrays.asList returns a fixed-size list; this line will throw UnsupportedOperationException
        return awsServices;
    }

    // This endpoint also lacks proper JavaDoc comments, which is a code smell
    @GetMapping("/getAllDevopsTools")
    public List<String> getAllDevopsTools(){
        // This code could be improved by using a mutable list instead of Arrays.asList()
        return Arrays.asList("git", "maven", "sonar", "nexus", "jenkins");
    }
}
