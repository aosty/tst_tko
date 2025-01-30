package com.br.testetokio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.br.testetokio.entity.AgendamentoEntity;
import com.br.testetokio.response.AgendamentoResponse;

@Mapper
public interface AgendamentoMapper {
	
	AgendamentoMapper INSTANCE = Mappers.getMapper( AgendamentoMapper.class );
	
	AgendamentoResponse toDto(AgendamentoEntity entity);
	List<AgendamentoResponse> map(List<AgendamentoEntity> employees);
	
}
