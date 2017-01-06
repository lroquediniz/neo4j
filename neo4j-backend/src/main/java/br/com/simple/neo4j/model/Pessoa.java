package br.com.simple.neo4j.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label="Pessoa")
public class Pessoa {

	private Long id;

	private String nome;

	private String cpf;

	private String rg;

	private String genero;

	private BigDecimal estatura;

	private String olhos;

	private String pele;

	private String sotaque;

	private String tipoCabelo;

	private Boolean falecido = Boolean.FALSE;

	private Endereco endereco;
	
	@Relationship(type = "Relacionamento")
	private List<PessoaRelacionamento> relacionamentos = new ArrayList<>();

	public Long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome ;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getEstatura() {
		return this.estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}

	public String getOlhos() {
		return this.olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public String getPele() {
		return this.pele;
	}

	public void setPele(String pele) {
		this.pele = pele;
	}

	public String getSotaque() {
		return this.sotaque;
	}

	public void setSotaque(String sotaque) {
		this.sotaque = sotaque;
	}

	public String getTipoCabelo() {
		return this.tipoCabelo;
	}

	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}

	public Boolean getFalecido() {
		return this.falecido;
	}

	public void setFalecido(Boolean falecido) {
		this.falecido = falecido;
	}

	public List<PessoaRelacionamento> getRelacionamentos() {
		return this.relacionamentos;
	}

	public void setRelacionamentos(List<PessoaRelacionamento> relacionamentos) {
		this.relacionamentos = relacionamentos;
	}

	
	public Endereco getEndereco() {
		return this.endereco;
	}

	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/*
	 * TODO: Implementar Serializable.
	 */
}
