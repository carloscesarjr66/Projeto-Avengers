package br.com.fiap.avenger.model;

public class Usuario {
	private int id_usuario;
	public String nome_usuario;
	public String email_usuario;
	public String senha_usuario;
	private int is_adm;
	
	public Usuario() {
	
	}
	public Usuario(int id_usuario, String nome_usuario, String email_usuario, String senha_usuario, int is_adm) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
		this.setIs_adm(is_adm);
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
	public int getIs_adm() {
		if (is_adm == 1 ) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public void setIs_adm(int is_adm) {
		if (is_adm == 0 || is_adm == 1) {
			this.is_adm = is_adm;
		}
		if (is_adm != 0 || is_adm != 1) {
			this.is_adm = 0;
		}
	}
	

}
