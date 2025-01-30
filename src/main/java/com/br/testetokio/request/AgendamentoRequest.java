package com.br.testetokio.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AgendamentoRequest {
	
	private String destino;
	private LocalDateTime dataAgendamento;
	private BigDecimal valor;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDateTime getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDateTime dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

}
