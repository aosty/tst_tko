package com.br.testetokio.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taxa")
public class TaxaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="inicio")
	private Integer inicio;
	
	@Column(name="fim")
	private Integer fim;
	
	@Column(name="porcentagem")
	private BigDecimal porcentagem;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public Integer getFim() {
		return fim;
	}

	public void setFim(Integer fim) {
		this.fim = fim;
	}

	public BigDecimal getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}
	
}
