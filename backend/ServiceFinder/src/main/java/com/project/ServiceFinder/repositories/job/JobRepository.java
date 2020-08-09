package com.project.ServiceFinder.repositories.job;

import com.project.ServiceFinder.projections.CustomJob;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomJob.class)
public interface JobRepository {
}
