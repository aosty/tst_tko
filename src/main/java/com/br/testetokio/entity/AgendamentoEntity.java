package com.br.testetokio.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="agendamento")
public class AgendamentoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private CorrentistaEntity correntista;
	
	@OneToOne
	private TaxaEntity taxa;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="valor")
	private BigDecimal valor;
	
	@Column(name="data_agendamento")
	private LocalDateTime dataAgendamento;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CorrentistaEntity getCorrentista() {
		return correntista;
	}

	public void setCorrentista(CorrentistaEntity correntista) {
		this.correntista = correntista;
	}

	public TaxaEntity getTaxa() {
		return taxa;
	}

	public void setTaxa(TaxaEntity taxa) {
		this.taxa = taxa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDateTime dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
}
