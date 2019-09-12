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
	
	public Valet getValet(Date dt_saida) throws Exception {
		stmt = con.prepareStatement
				("SELECT TBA_VALET.ID_VALE, TBA_VEICULO.PLACA, "
						+ "TBA_VEICULO.MARCA, TBA_VEICULO.MODELO, TBA_VALET.DT_ENTRADA, "
						+ "TBA_VALET.DT_SAIDA, TBA_VALET.PRECO FROM TBA_VALET, "
						+ "TBA_VEICULO WHERE TBA_VALET.ID_VALE = TBA_VEICULO.ID_VEICULO AND "
						+ "TBA_VALET.DT_SAIDA = ?");
	                                  	
		stmt.setDate(1,  dt_saida);
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return new Valet(
					rs.getInt("ID_VALE"),
					rs.getDate("DT_ENTRADA"),
					rs.getDate("DT_SAIDA"),
					rs.getDouble("PRECO")
					), new Veiculo (
							rs.getString("PLACA"),
							rs.getString("MARCA"),
							rs.getString("MODELO")
							);   
		} else {
			return new Valet();
		}
	}
}
