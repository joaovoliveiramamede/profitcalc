package com.profit.calc.finance.model;

import java.io.Serializable;

public class ProfitData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Double receita;
	private Double custoUnidade;
	private Double custoProducao;
	private Integer units;
	
	public ProfitData() {}
	
	public ProfitData(String nome, Double receita, Double custoUnidade, Double custoProducao) {
		super();
		this.receita = receita;
		this.custoUnidade = custoUnidade;
		this.custoProducao = custoProducao;
	}

	public Double getReceita() {
		return receita;
	}

	public void setReceita(Double receita) {
		this.receita = receita;
	}

	public Double getCustoUnidade() {
		return custoUnidade;
	}

	public void setCustoUnidade(Double custoUnidade) {
		this.custoUnidade = custoUnidade;
	}

	public Double getCustoProducao() {
		return custoProducao;
	}

	public void setCustoProducao(Double custoProducao) {
		this.custoProducao = custoProducao;
	}

	public Integer getUnits() {
		return units;
	}
	
	public void setUnits(Integer units) {
		this.units = units;
	}
}
