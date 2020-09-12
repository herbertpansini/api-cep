package br.com.cep.mapper;

import org.mapstruct.Mapper;

import br.com.cep.controller.dto.CidadeDto;
import br.com.cep.model.Cidade;

@Mapper(componentModel = "spring")
public interface CidadeMapper extends EntityMapper<CidadeDto, Cidade> {
	
}
