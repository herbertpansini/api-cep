package br.com.cep.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tcidade")
@Data
public class Cidade implements Serializable {
  
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ibge", length = 20, nullable = false)
	private String ibge;
	
	@Column(name = "uf", length = 2, nullable = false)  
	private String uf;
	
	@Column(name = "localidade", length = 100, nullable = false)  
	private String localidade;
}