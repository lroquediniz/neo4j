package br.com.simple.neo4j.model;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import br.com.simple.neo4j.types.TipoRelacionamento;

@RelationshipEntity(type = "Relacionamento")
public class PessoaRelacionamento {

	@GraphId
	private Long id;

	@StartNode
	private Pessoa fonte;

	@EndNode
	private Pessoa destino;

	@DateLong
	private Date enrolledDate;

	private TipoRelacionamento tipoRelacionamento;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getFonte() {
		return this.fonte;
	}

	public void setFonte(Pessoa fonte) {
		this.fonte = fonte;
	}

	public Pessoa getDestino() {
		return this.destino;
	}

	public void setDestino(Pessoa destino) {
		this.destino = destino;
	}

	public Date getEnrolledDate() {
		return this.enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public TipoRelacionamento getTipoRelacionamento() {
		return this.tipoRelacionamento;
	}

	public void setTipoRelacionamento(TipoRelacionamento tipoRelacionamento) {
		this.tipoRelacionamento = tipoRelacionamento;
	}

	@Override
	public String toString() {
		return "PessoaRelacionamento [id=" + id + ", destino=" + destino + ", tipoRelacionamento=" + tipoRelacionamento
				+ "]";
	}

}
