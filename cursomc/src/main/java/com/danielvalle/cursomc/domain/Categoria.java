package com.danielvalle.cursomc.domain;

public class Categoria {
	
	private Integer id;
	private String nome;

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Categoria() {		//Empty Constructor
		
	}

	public Integer getId() {	 	//Getter for Id
		return id;
	}

	public void setId(Integer id) {		//Setter for Id
		this.id = id;
	}

	public String getNome() {		//Getter for nome
		return nome;
	}

	public void setNome(String nome) {		//Setter for nome
		this.nome = nome;
	}
}
