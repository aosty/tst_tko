package com.br.testetokio.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.testetokio.entity.CorrentistaEntity;
import com.br.testetokio.service.CorrentistaService;

@Component
public class SessaoData {
	
	@Autowired
	private CorrentistaService service;
	
	/**
	 * Obtem um Correntista que estaria na sessao
	 */
	public CorrentistaEntity getCorrentistaSessao() {
		return service.obterPorConta("03030-30");
	}
	
}
