package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarketingStrategyManager {
    private List<MarketingStrategy> strategies;

    public MarketingStrategyManager() {
        this.strategies = new ArrayList<>();
    }

    public void createStrategy(MarketingStrategy strategy) {
        strategies.add(strategy);
        System.out.println("Strategy Added Successfully.");
    }

    public MarketingStrategy getStrategyByName(String name) {
        return strategies.stream()
                .filter(strategy -> strategy.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void updateStrategy(MarketingStrategy updatedStrategy) {
        MarketingStrategy existingStrategy = getStrategyByName(updatedStrategy.getName());
        if (existingStrategy != null) {
            existingStrategy.setDescription(updatedStrategy.getDescription());
            existingStrategy.setTargetAudience(updatedStrategy.getTargetAudience());
            existingStrategy.setBudget(updatedStrategy.getBudget());
            existingStrategy.setPotentialROI(updatedStrategy.getPotentialROI());
            System.out.println("Strategy Updated Successfully.");
        } else {
            System.out.println("Strategy not found.");
        }
    }

    public void deleteStrategy(String name) {
        MarketingStrategy strategy = getStrategyByName(name);
        if (strategy != null) {
            strategies.remove(strategy);
            System.out.println("Strategy Deleted Successfully.");
        } else {
            System.out.println("Strategy not found.");
        }
    }

    public List<MarketingStrategy> getStrategiesInBudgetRange(double minBudget, double maxBudget) {
        return strategies.stream()
                .filter(strategy -> strategy.getBudget() >= minBudget && strategy.getBudget() <= maxBudget)
                .collect(Collectors.toList());
    }

    public List<MarketingStrategy> getAllStrategies() {
        return new ArrayList<>(strategies);
    }
}
