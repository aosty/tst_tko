package com.br.testetokio.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.br.testetokio.entity.CorrentistaEntity;
import com.br.testetokio.entity.TaxaEntity;

public class AgendamentoResponse {
	
	private Long id;
	private CorrentistaEntity correntista;
	private TaxaEntity taxa;
	private String destino;
	private BigDecimal valor;
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
