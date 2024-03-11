package com.driver;
public class MarketingStrategy {
    private String name;
    private String description;
    private String targetAudience;
    private double budget;
    private double potentialROI;

    public MarketingStrategy(String name, String description, String targetAudience, double budget, double potentialROI) {
        this.name = name;
        this.description = description;
        this.targetAudience = targetAudience;
        this.budget = budget;
        this.potentialROI = potentialROI;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public double getBudget() {
        return budget;
    }

    public double getPotentialROI() {
        return potentialROI;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setPotentialROI(double potentialROI) {
        this.potentialROI = potentialROI;
    }

    @Override
    public String toString() {
        return "MarketingStrategy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", budget=" + budget +
                ", potentialROI=" + potentialROI +
                '}';
    }
}