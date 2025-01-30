package com.br.testetokio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.testetokio.entity.TaxaEntity;

@Repository
public interface TaxaRepository extends CrudRepository<TaxaEntity, Long> {
	
	public List<TaxaEntity> findByInicioLessThanEqualAndFimGreaterThanEqual(Integer d1,Integer d2);

}
