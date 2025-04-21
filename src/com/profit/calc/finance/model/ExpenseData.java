package com.profit.calc.finance.model;

import java.io.Serializable;

public class ExpenseData implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
	private Double fixedCost;
    private Double variableCost;
    
    public ExpenseData() {}

    public ExpenseData(Double fixedCost, Double variableCost) {
        this.fixedCost = fixedCost;
        this.variableCost = variableCost;
    }

    public void setFixedCost(Double fixedCost) {
        this.fixedCost = fixedCost;
    }

    public Double getFixedCost() {
        return fixedCost;
    }

    public void setVariableCost(Double variableCost) {
        this.variableCost = variableCost;
    }

    public Double getVariableCost() {
        return variableCost;
    }

}
