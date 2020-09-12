package br.com.cep.service;

import java.util.List;

import br.com.cep.controller.dto.CepDto;

public interface CepService {
	
	public CepDto findByCep(String cep);
	
	public List<CepDto> findByIbgeAndUf(String ibge, String uf);
	
	public CepDto save(CepDto cepDto);
}
