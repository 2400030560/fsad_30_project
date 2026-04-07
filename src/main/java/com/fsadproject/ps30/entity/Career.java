package com.fsadproject.ps30.entity;

import jakarta.persistence.*;

@Entity
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String category;
    private String salary;
    private String outlook;
    private String icon;

    // getters & setters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getSalary() {
        return salary;
    }

    public String getOutlook() {
        return outlook;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setOutlook(String outlook) {
        this.outlook = outlook;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}