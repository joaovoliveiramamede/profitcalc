package com.profit.calc.finance.model.request;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProfitDataResquest {
	
	private UUID id;
	private Double revenue;
	private Double costPerunit;
	private Double costForProduction;
	
	public ProfitDataResquest() {
		this.id = UUID.randomUUID();
	}
}