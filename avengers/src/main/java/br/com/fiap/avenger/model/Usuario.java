package br.com.fiap.avenger.model;

public class Usuario {
	private int id_usuario;
	public String nome_usuario;
	public String email_usuario;
	public String senha_usuario;
	
	public Usuario() {
	
	}
	public Usuario(int id_usuario, String nome_usuario, String email_usuario, String senha_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	

}
