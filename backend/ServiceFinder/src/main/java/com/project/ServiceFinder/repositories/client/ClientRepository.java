package com.project.ServiceFinder.repositories.client;

import com.project.ServiceFinder.models.Client;
import com.project.ServiceFinder.projections.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Long>, ClientRepositoryCustom {
}
