package br.com.cep.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tcep")
@Data
public class Cep implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cep", length = 10, nullable = false)
	private String cep;

	@Column(name = "logradouro", nullable = false)
	private String logradouro;

	@Column(name = "complemento", nullable = true)
	private String complemento;

	@Column(name = "bairro", length = 50, nullable = true)
	private String bairro;

	@ManyToOne	
    @JoinColumn(name="ibge", columnDefinition = "varchar(20)", nullable = false)
	private Cidade cidade;
}