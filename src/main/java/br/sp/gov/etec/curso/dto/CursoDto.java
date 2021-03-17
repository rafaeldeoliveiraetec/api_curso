package br.sp.gov.etec.curso.dto;

import java.io.Serializable;

public class CursoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long Id;
	private String nome;
	private String sigla;
	
	public CursoDto() {
		
	}
	
	public CursoDto(Long id, String nome, String sigla) {
		super();
		Id = id;
		this.nome = nome;
		this.sigla = sigla;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
