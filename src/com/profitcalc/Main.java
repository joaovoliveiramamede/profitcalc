package com.profitcalc;

import com.profitcalc.finance.model.ProfitData;
import com.profitcalc.finance.service.ProfitCalculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		ProfitData data = new ProfitData();
		data.setNome("Teste");
		data.setCustoMaterial(18);
		data.setCustoProducao(1200);
		data.setReceitaPorUnidade(30);
		data.setUnidadesVendidas(200);
		
		
		ProfitCalculator calculator = new ProfitCalculator();
		Integer lucro = calculator.calcLucro(data);
		
		System.out.println("Lucro: " + lucro);
	}
}