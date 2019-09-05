package br.com.fiap.avenger.main;

import java.sql.Connection;

import br.com.fiap.avenger.conexao.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		Connection conectar = null;
		try {
			conectar = Conexao.queroConectar();
			System.out.println("Conectou");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conectar.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
