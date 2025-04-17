package com.profitcalc.finance.model;

public class ProfitData {
	private String nome;
	private Integer custoMaterial;
	private Integer custoProducao;
	private Integer receitaPorUnidade;
	private Integer unidadesVendidas;
	
	public ProfitData() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCustoMaterial() {
		return custoMaterial;
	}
	public void setCustoMaterial(Integer custoMaterial) {
		this.custoMaterial = custoMaterial;
	}
	public Integer getCustoProducao() {
		return custoProducao;
	}
	public void setCustoProducao(Integer custoProducao) {
		this.custoProducao = custoProducao;
	}
	public Integer getReceitaPorUnidade() {
		return receitaPorUnidade;
	}
	public void setReceitaPorUnidade(Integer receitaPorUnidade) {
		this.receitaPorUnidade = receitaPorUnidade;
	}
	public Integer getUnidadesVendidas() {
		return unidadesVendidas;
	}
	public void setUnidadesVendidas(Integer unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}
}
