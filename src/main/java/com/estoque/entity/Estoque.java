package com.estoque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 30, nullable = false)
	private String item;
	@Column(length = 30)
	private String fornecedor;
	@Column(nullable = false)
	private Integer estoqueMinimo;
	@Column(nullable = false)
	private Integer estoqueAtual;

	public Estoque() {
		super();
	}

	public Estoque(String item, String fornecedor, Integer estoqueMinimo, Integer estoqueAtual) {
		super();
		this.item = item;
		this.fornecedor = fornecedor;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueAtual = estoqueAtual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Integer getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(Integer estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

}
