package br.com.cep.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cep.controller.dto.CidadeDto;
import br.com.cep.mapper.CidadeMapper;
import br.com.cep.model.Cidade;
import br.com.cep.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CidadeServiceImpl implements CidadeService {

	private final CidadeRepository cidadeRepository;
	
	private final CidadeMapper cidadeMapper;
	
	@Override
	public CidadeDto save(CidadeDto cidadeDto) {
		Cidade cidade = this.cidadeMapper.toEntity(cidadeDto);
		return this.cidadeMapper.toDto(this.cidadeRepository.save(cidade));
	}
}