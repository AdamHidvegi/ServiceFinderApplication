package com.project.ServiceFinder.controllers;

import com.project.ServiceFinder.repositories.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jobs")
public class JobController {

    @Autowired
    JobRepository jobRepository;

}
