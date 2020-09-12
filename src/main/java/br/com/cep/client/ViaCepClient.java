package br.com.cep.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.cep.controller.dto.ViaCep;

@FeignClient(name = "ViaCepClient", url = "http://viacep.com.br")
public interface ViaCepClient {

	@GetMapping("/ws/{cep}/json/")
	public ViaCep consultarCep(@PathVariable String cep);
}