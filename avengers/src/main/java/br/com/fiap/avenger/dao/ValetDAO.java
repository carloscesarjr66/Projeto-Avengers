package br.com.fiap.avenger.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.avenger.conexao.Conexao;
import br.com.fiap.avenger.model.Valet;

public class ValetDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs; 
	
	public ValetDAO() throws Exception {
		con = Conexao.queroConectar();
	} 
	
}
