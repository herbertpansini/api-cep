package br.com.cep.mapper;

import org.mapstruct.Mapper;

import br.com.cep.controller.dto.CepDto;
import br.com.cep.model.Cep;

@Mapper(componentModel = "spring", uses = {CidadeMapper.class})
public interface CepMapper extends EntityMapper<CepDto, Cep> {

}