package com.profit.calc.finance.model.request;

import java.util.UUID;

public class ProfitDataResponse {
	
	private UUID id;
	private Double result;
	private Double expense;
	
	public ProfitDataResponse() {}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	public Double getExpense() {
		return expense;
	}
	public void setExpense(Double expense) {
		this.expense = expense;
	}
	
	
	
	
}
