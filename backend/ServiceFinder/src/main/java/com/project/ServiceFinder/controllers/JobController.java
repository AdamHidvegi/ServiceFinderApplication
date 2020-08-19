package com.project.ServiceFinder.controllers;

import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import com.project.ServiceFinder.repositories.freelancer.FreelancerRepository;
import com.project.ServiceFinder.repositories.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jobs")
public class JobController {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    FreelancerRepository freelancerRepository;

    @GetMapping(value = "/{id}/applicants")
    public List<Freelancer> applicants(@PathVariable long id) {
        return freelancerRepository.findAll();
    }

}
