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
				("select * from TBA_VEICULO where PLACA=?"); 
		stmt.setString(1, placa); 
		rs = stmt.executeQuery(); 
		if (rs.next()) {
			return new Veiculo(
					rs.getInt("ID_VEICULO"), 
					rs.getString("PLACA"), 
					rs.getString("MARCA"), 
					rs.getString("MODELO")
					);
		} else {
			return new Veiculo();
		}
	} 
	
	public int addVeiculo(Veiculo v) throws Exception {
		stmt = con.prepareStatement("INSERT INTO "
				+ "TBA_VEICULO(ID_VEICULO, PLACA, MARCA, MODELO)"
				+ "VALUES(?,?,?,?)");  
		stmt.setInt(1, v.getId_veiculo());
		stmt.setString(2, v.getPlaca());
		stmt.setString(3, v.getMarca()); 
		stmt.setString(4, v.getModelo()); 
		return stmt.executeUpdate();
	}  
	
	public int deletarVeiculo(String placa) throws Exception {
		stmt = con.prepareStatement("delete from TBA_VEICULO where PLACA=?");
		stmt.setString(1, placa);
		return stmt.executeUpdate();
	}
	
	public void encerrar() throws Exception {
		con.close();
	}
}
