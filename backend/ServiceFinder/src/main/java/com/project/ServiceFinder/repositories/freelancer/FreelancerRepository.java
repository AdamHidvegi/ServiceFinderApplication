package com.project.ServiceFinder.repositories.freelancer;

import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import com.project.ServiceFinder.projections.CustomFreelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = CustomFreelancer.class)
public interface FreelancerRepository extends JpaRepository<Freelancer, Long>, FreelancerRepositoryCustom {

}
