package com.profitcalc.finance.service;

import com.profitcalc.finance.model.ProfitData;

public class ProfitCalculator {
	
	public ProfitCalculator() {}
	
	public Integer calcLucro(ProfitData data) {
		Integer unidades = data.getUnidadesVendidas();
		
		Integer receita = data.getReceitaPorUnidade() * unidades;
		Integer custoFixo = data.getCustoMaterial() * unidades;
		Integer custoVariavel = data.getCustoProducao() * unidades;
		
		Integer lucro = receita - (custoFixo + custoVariavel);
		return lucro;
	}
	
}
