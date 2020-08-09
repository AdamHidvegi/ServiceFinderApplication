package com.project.ServiceFinder.projections;

import com.project.ServiceFinder.models.Client;
import com.project.ServiceFinder.models.Job;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "customClient", types = Client.class)
public interface CustomClient {
    long getId();
    String getUser_name();
    String getFirst_name();
    String getLast_name();
    List<Job> getPosted_jobs();
}
