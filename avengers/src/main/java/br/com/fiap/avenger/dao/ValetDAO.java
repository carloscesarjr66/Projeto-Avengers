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
	
	public int addValet(Valet v) throws Exception{
		stmt = con.prepareStatement("INSERT INTO "
				+ "TBA_VALET(ID_VALE, DT_ENTRADA, DT_SAIDA, PRECO, ID_VEICULO)"
				+ "VALUES(?,?,?,?,?)");  
		stmt.setInt(1, v.getId_valet()); 
		stmt.setDate(2, (Date) v.getEntrada()); 
		stmt.setDate(3, (Date) v.getSaida()); 
		stmt.setDouble(4, v.getPreco());
		stmt.setInt(5, v.getVeiculo().getId_veiculo());
		return stmt.executeUpdate();
	}
}
