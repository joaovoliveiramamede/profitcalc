package com.profit.calc.finance.model;

public class ProfitRequest {
	private Double receita;
	private Double custoUnidade;
	private Double custoProducao;
	private Integer qtdVendidas;
	
	public ProfitRequest() {}
	
	public ProfitRequest(String nome, Double receita, Double custoUnidade, Double custoProducao) {
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

	public Integer getQtdVendidas() {
		return qtdVendidas;
	}

	public void setQtdVendidas(Integer qtdVendidas) {
		this.qtdVendidas = qtdVendidas;
	}
	
}
