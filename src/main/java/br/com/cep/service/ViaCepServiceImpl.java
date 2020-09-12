package br.com.cep.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cep.client.ViaCepClient;
import br.com.cep.controller.dto.ViaCep;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ViaCepServiceImpl implements ViaCepService {
	
	private final ViaCepClient viaCepClient;

	@Override
	public ViaCep consultarCep(String cep) {
		return this.viaCepClient.consultarCep(cep);
	}
}
