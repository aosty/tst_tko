package com.br.testetokio.service;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.testetokio.data.CorrentistaData;
import com.br.testetokio.entity.CorrentistaEntity;
import com.br.testetokio.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	CorrentistaRepository repository;

	public CorrentistaEntity obterPorConta(String conta) {
		return repository.findByConta(conta).stream().findFirst().orElseThrow(
				() -> new RuntimeException(MessageFormat.format("Nenhum correntista encontrado para {0}.", conta)));
	}

	public CorrentistaEntity adicionar() {
		return repository.save(CorrentistaData.mockCorrentista());
	}

}
