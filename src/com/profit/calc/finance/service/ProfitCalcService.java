package com.profit.calc.finance.service;

import com.profit.calc.finance.model.ExpenseData;
import com.profit.calc.finance.model.ProfitData;
import com.profit.calc.finance.service.contract.ExpenseServiceContract;

public class ProfitCalcService implements ExpenseServiceContract {

		
	@Override
	public Double calculate(ProfitData data) {
		
		Integer units = data.getUnits();
		
		Double receita = data.getReceita() * units;
		Double custoPorUnidade = data.getCustoUnidade() * units;
		Double custoParaProducao = data.getCustoProducao();
		
		Double result = receita - (custoPorUnidade + custoParaProducao);
		return result;
	}
}