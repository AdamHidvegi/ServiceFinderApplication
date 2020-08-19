package com.project.ServiceFinder.controllers;

import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import com.project.ServiceFinder.repositories.freelancer.FreelancerRepository;
import com.project.ServiceFinder.repositories.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/freelancers")
public class FreelancerController {

    @Autowired
    FreelancerRepository freelancerRepository;

    @Autowired
    JobRepository jobRepository;

//    @GetMapping(value = "/{id}/applications")
//    public void applications(@PathVariable long id) {
//        Freelancer freelancer = freelancerRepository.getOne(id);
//        freelancer.getJobs();
//    }

}
