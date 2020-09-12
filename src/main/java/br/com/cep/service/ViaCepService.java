package br.com.cep.service;

import br.com.cep.controller.dto.ViaCep;

public interface ViaCepService {
	
	public ViaCep consultarCep(String cep);
}
