package edu.br.whatsapp.modelo;

import java.io.File;
import java.time.Instant;

public class Mensagem {
	private File anexo;
	private String texto;
	private Usuario remetente;
	private Usuario destinatario;
	private Instant horario;
	

	public Mensagem(String texto, Usuario remetente, Usuario destinatario) {
		super();
		this.texto = texto;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.horario = Instant.now();
	}
	
	
	public File getAnexo() {
		return anexo;
	}


	public void setAnexo(File anexo) {
		this.anexo = anexo;
	}


	public String getTexto() {
		return texto;
	}
	
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public Usuario getRemetente() {
		return remetente;
	}
	
	
	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}
	
	
	public Usuario getDestinatario() {
		return destinatario;
	}
	
	
	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}
	
	
	public Instant getHorario() {
		return horario;
	}
	
	
	public void setHorario(Instant horario) {
		this.horario = horario;
	}
	
	
	
}
