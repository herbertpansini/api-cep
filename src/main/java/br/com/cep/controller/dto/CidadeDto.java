package br.com.cep.controller.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CidadeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ibge;
	private String uf;
	private String localidade;
}