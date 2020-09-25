package br.com.cep.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cep.controller.dto.CepDto;
import br.com.cep.controller.dto.CidadeDto;
import br.com.cep.controller.dto.ViaCep;
import br.com.cep.service.CepService;
import br.com.cep.service.ViaCepService;
import br.com.cep.util.Util;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CepController {
	
	private final CepService cepService;
	private final ViaCepService viaCepService;
	
	@GetMapping("/cep/{cep}")
	public ResponseEntity<CepDto> findByCep(@PathVariable String cep) {
		String cepFormatado = Util.formatString(cep, "#####-###");
		CepDto cepDto = this.cepService.findByCep(cepFormatado);
		if (cepDto == null) {
			ViaCep viaCep = viaCepService.consultarCep(cep);
			
			CidadeDto cidadeDto = new CidadeDto();
			cidadeDto.setIbge(viaCep.getIbge());
			cidadeDto.setLocalidade(viaCep.getLocalidade());
			cidadeDto.setUf(viaCep.getUf());
			
			cepDto = new CepDto();
			cepDto.setCep(viaCep.getCep());
			cepDto.setLogradouro(viaCep.getLogradouro());
			cepDto.setComplemento(viaCep.getComplemento());
			cepDto.setBairro(viaCep.getBairro());
			cepDto.setCidade(cidadeDto);			

			this.cepService.save(cepDto);
		}
		return ResponseEntity.ok(cepDto);
	}
	
	@GetMapping("/ceps")
	public ResponseEntity<List<CepDto>> findByIbgeAndUf(@RequestParam(required = true) String ibge, @RequestParam(required = false) String uf) {		
		List<CepDto> ceps = this.cepService.findByIbgeAndUf(ibge, uf);
		return ResponseEntity.ok(ceps);
	}	
}