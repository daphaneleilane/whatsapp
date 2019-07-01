package edu.br.whatsapp.modelo;

import java.util.List;

public class Usuario {
	private String nome;
	private String foto;
	private String recado;
	private String numero;
	private List<Usuario>contatos;


	public Usuario(String nome, String foto, String recado, String numero, List<Usuario> contatos) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.recado = recado;
		this.numero = numero;
		this.contatos = contatos;
	}

	public List<Usuario> getContatos() {
		return contatos;
	}

	public void setContatos(List<Usuario> contatos) {
		this.contatos = contatos;
	}

	public Usuario(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getRecado() {
		return recado;
	}
	
	public void setRecado(String recado) {
		this.recado = recado;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
