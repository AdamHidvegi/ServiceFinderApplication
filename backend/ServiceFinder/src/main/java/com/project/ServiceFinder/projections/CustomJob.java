package com.project.ServiceFinder.projections;

import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "customJob", types = Job.class)
public interface CustomJob {
    long getId();
    String getTitle();
    String getLocation();
    String getDescription();
    List<Freelancer> getApplicants();
}
