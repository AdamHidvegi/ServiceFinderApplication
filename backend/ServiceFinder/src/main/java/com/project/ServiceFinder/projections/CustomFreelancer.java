package com.project.ServiceFinder.projections;

import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "customFreelancer", types = Freelancer.class)
public interface CustomFreelancer {
    long getId();
    String getUser_name();
    String getFirst_name();
    String getLast_name();
    String getLocation();
    List<Job> getJobs();
    Date getRegistration_date();
}
