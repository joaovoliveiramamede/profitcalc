package com.profit.calc.finance.service;

import com.profit.calc.finance.model.ProfitRequest;

public class ProfitCalcService {
	public int calc(int receita, int custo) {
        return  custo - receita;
    }
	
	public Double profitCalc(ProfitRequest request) {
		Integer unidadesVendidas = request.getQtdVendidas();
		
		Double receita = request.getReceita() * unidadesVendidas;
		
		Double custoFixo = request.getCustoUnidade() * unidadesVendidas;
		Double custoProducao = request.getCustoProducao();
		Double custo = custoFixo + custoProducao;
		
		Double lucro = receita - custo;
		
		return lucro;
	}
}