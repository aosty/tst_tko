package com.br.testetokio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.testetokio.entity.AgendamentoEntity;
import com.br.testetokio.entity.CorrentistaEntity;

@Repository
public interface AgendamentoRepository extends CrudRepository<AgendamentoEntity, Long> {
	
	public List<AgendamentoEntity> findByCorrentista(CorrentistaEntity correntista);

}
