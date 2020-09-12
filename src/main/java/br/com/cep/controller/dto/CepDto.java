package br.com.cep.controller.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CepDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private CidadeDto cidade;
}