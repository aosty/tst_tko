package com.br.testetokio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.testetokio.data.SessaoData;
import com.br.testetokio.entity.AgendamentoEntity;
import com.br.testetokio.mapper.AgendamentoMapper;
import com.br.testetokio.repository.AgendamentoRepository;
import com.br.testetokio.request.AgendamentoRequest;
import com.br.testetokio.response.AgendamentoResponse;
import com.br.testetokio.util.AgendamentoUtil;

@Service
public class AgendamentoService {
	
	@Autowired
	AgendamentoRepository repository;
	
	@Autowired
	SessaoData sessao;
	
	@Autowired
	TaxaService taxaService;

	
	public AgendamentoResponse agendar(AgendamentoRequest request) {
		
		AgendamentoEntity entity = new AgendamentoEntity();
		entity.setCorrentista(sessao.getCorrentistaSessao());
		entity.setTaxa(taxaService.obterPorPeriodo(AgendamentoUtil.calculaPeriodo(request.getDataAgendamento())));
		entity.setDataAgendamento(request.getDataAgendamento());
		entity.setDestino(request.getDestino());
		entity.setValor(request.getValor());

		return AgendamentoMapper.INSTANCE.toDto(repository.save(entity));
	}
	
	
	public List<AgendamentoResponse> obterAgendamentos() {
		return AgendamentoMapper.INSTANCE.map(repository.findByCorrentista(sessao.getCorrentistaSessao()));
	}

}
