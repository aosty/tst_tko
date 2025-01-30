package com.br.testetokio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.testetokio.entity.CorrentistaEntity;

@Repository
public interface CorrentistaRepository extends CrudRepository<CorrentistaEntity, Long>{
	
	public List<CorrentistaEntity> findByConta(String conta);

}
