package br.com.fiap.avenger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.avenger.conexao.Conexao;
import br.com.fiap.avenger.model.Veiculo;

public class VeiculoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs; 
	
	public VeiculoDAO() throws Exception {
		con = Conexao.queroConectar();
	} 
	
	public Veiculo getVeiculo(String placa) throws Exception {
		stmt = con.prepareStatement
				("select * from TBA_USUARIO where ID_VEICULO=?"); 
		
	}
}
