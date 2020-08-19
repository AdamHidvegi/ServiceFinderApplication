package com.project.ServiceFinder.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "title")
    private String title;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "category")
    private String category;

    @JsonIgnoreProperties("jobs")
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @JsonIgnoreProperties("jobs")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "job_applicants",
            joinColumns = {@JoinColumn(name = "job_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "freelancer_id", nullable = false, updatable = false)}
    )
    private List<Freelancer> applicants;

    public Job(String title, String location, String description, double salary, Integer duration, String category, Client client) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.salary = salary;
        this.duration = duration;
        this.category = category;
        this.client = client;
        this.applicants = new ArrayList<Freelancer>();
    }

    public Job() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Freelancer> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Freelancer> applicants) {
        this.applicants = applicants;
    }

    public void addFreelancer(Freelancer freelancer) {
        this.applicants.add(freelancer);
    }
}
