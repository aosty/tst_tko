package com.br.testetokio.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.testetokio.data.TaxaData;
import com.br.testetokio.entity.TaxaEntity;
import com.br.testetokio.repository.TaxaRepository;

@Service
public class TaxaService {

	@Autowired
	TaxaRepository repository;

	public TaxaEntity obterPorPeriodo(Integer periodo) {
		return repository.findByInicioLessThanEqualAndFimGreaterThanEqual(periodo, periodo).stream().findFirst()
				.orElseThrow(() -> new RuntimeException(
						MessageFormat.format("Nenhuma taxa valida para o periodo de {0}.", periodo)));
	}

	public List<TaxaEntity> adicionar() {
		List<TaxaEntity> retorno = new ArrayList<TaxaEntity>();
		repository.saveAll(TaxaData.mockTaxas()).forEach(retorno::add);
		return retorno;
	}

}
