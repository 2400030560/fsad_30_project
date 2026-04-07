package com.fsadproject.ps30.entity;

import jakarta.persistence.*;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalScore;
    private String recommendation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assessment_id")
    private Assessment assessment;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getTotalScore() { return totalScore; }
    public void setTotalScore(int totalScore) { this.totalScore = totalScore; }

    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Assessment getAssessment() { return assessment; }
    public void setAssessment(Assessment assessment) { this.assessment = assessment; }
}