package com.project.ServiceFinder.components;

import com.project.ServiceFinder.models.Client;
import com.project.ServiceFinder.models.Freelancer;
import com.project.ServiceFinder.models.Job;
import com.project.ServiceFinder.repositories.client.ClientRepository;
import com.project.ServiceFinder.repositories.freelancer.FreelancerRepository;
import com.project.ServiceFinder.repositories.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    FreelancerRepository freelancerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Date date = new Date();

        //client
        Client client1 = new Client("AdamH", "Adam", "Hidvegi", "bla@gmail.com", "1234", "Glasgow", date);
        clientRepository.save(client1);

        Client client2 = new Client("DanielH", "Daniel", "Hidvegi", "bla@gmail.com", "1234", "Glasgow", date);
        clientRepository.save(client2);

        //freelancer
        Freelancer freelancer1 = new Freelancer("KincsoT", "Kincso", "Turai", "bla@gmail.com", "1234", "Glasgow", date, "overview");
        freelancerRepository.save(freelancer1);

        Freelancer freelancer2 = new Freelancer("KincsoTurai", "Kincso", "Turai", "bla@gmail.com", "1234", "Glasgow", date, "overview");
        freelancerRepository.save(freelancer2);

        //job
        Job job1 = new Job("Developer", "Glasgow", "description", 10.00, 2, "Software Development", client1);
        jobRepository.save(job1);

        //applicants
        job1.addFreelancer(freelancer1);
        jobRepository.save(job1);

        //applications
        freelancer1.addJob(job1);
        freelancerRepository.save(freelancer1);

    }

}
