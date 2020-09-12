package br.com.cep.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cep.controller.dto.CepDto;
import br.com.cep.mapper.CepMapper;
import br.com.cep.model.Cep;
import br.com.cep.repository.CepRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {
	
	private final CepRepository cepRepository;
	
	private final CepMapper cepMapper;
	
	@Override
	public CepDto findByCep(String cep) {
		return this.cepMapper.toDto(this.cepRepository.findByCep(cep));
	}

	@Override
	public List<CepDto> findByIbgeAndUf(String ibge, String uf) {
		return this.cepMapper.toDto(this.cepRepository.findByIbgeAndUf(ibge, uf));
	}

	@Override
	public CepDto save(CepDto cepDto) {
		Cep cep = this.cepMapper.toEntity(cepDto);
		return this.cepMapper.toDto(this.cepRepository.save(cep));
	}
}
