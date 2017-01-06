package br.com.simple.neo4j.model;

import br.com.simple.neo4j.types.Estado;

public class Endereco{

	private Long id;
	
	private String logradouro;

	private String numero;

	private String complemento;

	private Integer cep;

	private String bairro;

	private String cidade;

	private Estado estado;
	
	
	public Long getId() {
		return this.id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retorna o valor do atributo logradouro.
	 * @author Luan Roque
	 * @return logradouro
	 */
	public String getLogradouro() {
		return this.logradouro;
	}

	/**
	 * Altera o valor do atributo logradouro.
	 * @author Luan Roque
	 * @param logradouro - logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Retorna o valor do atributo complemento.
	 * @author Luan Roque
	 * @return complemento
	 */
	public String getComplemento() {
		return this.complemento;
	}

	/**
	 * Altera o valor do atributo complemento.
	 * @author Luan Roque
	 * @param complemento - complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Retorna o valor do atributo cep.
	 * @author Luan Roque
	 * @return cep
	 */
	public Integer getCep() {
		return this.cep;
	}

	/**
	 * Altera o valor do atributo cep.
	 * @author Luan Roque
	 * @param cep - cep
	 */
	public void setCep(Integer cep) {
		this.cep = cep;
	}

	/**
	 * Retorna o valor do atributo bairro.
	 * @author Luan Roque
	 * @return bairro
	 */
	public String getBairro() {
		return this.bairro;
	}

	/**
	 * Altera o valor do atributo bairro.
	 * @author Luan Roque
	 * @param bairro - bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Retorna o valor do atributo cidade.
	 * @author Luan Roque
	 * @return cidade
	 */
	public String getCidade() {
		return this.cidade;
	}

	/**
	 * Altera o valor do atributo cidade.
	 * @author Luan Roque
	 * @param cidade - cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Retorna o valor do atributo estado.
	 * @author Luan Roque
	 * @return estado
	 */
	public Estado getEstado() {
		return this.estado;
	}

	/**
	 * Altera o valor do atributo estado.
	 * @author Luan Roque
	 * @param estado - estado
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * Retorna o valor do atributo numero.
	 * @author Luan Roque
	 * @return numero
	 */
	public String getNumero() {
		return this.numero;
	}

	/**
	 * Altera o valor do atributo numero.
	 * @author Luan Roque
	 * @param numero - numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

}