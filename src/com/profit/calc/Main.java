package com.profit.calc;

import com.profit.calc.finance.model.ProfitData;
import com.profit.calc.finance.service.ProfitCalcService;

public class Main {
	
	public static void main(String[] args) {
		ProfitCalcService service = new ProfitCalcService();
		
		ProfitData request = new ProfitData();
		request.setUnits(200);
		request.setReceita(30.0);
		request.setCustoUnidade(18.0);
		request.setCustoProducao(1200.0);
		
		Double profit = service.calculate(request);
		
		System.out.println("Lucro: " + profit);
		
		
	}
}