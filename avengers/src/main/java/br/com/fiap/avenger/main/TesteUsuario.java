package br.com.fiap.avenger.main;

import br.com.fiap.avenger.dao.UsuarioDAO;
import br.com.fiap.avenger.model.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		UsuarioDAO dao_usu = null;
		
		try {
			dao_usu = new UsuarioDAO();
			Usuario u = dao_usu.getUser(5);
			System.out.println("NOME: " + u.getNome_usuario()); 
			System.out.println("EMAIL: "+u.getEmail_usuario()); 
			System.out.println("SENHA: "+u.getSenha_usuario()); 
			System.out.println("É ADM? " + ((u.getIs_adm() == 1) ? "True" : "False"));
			dao_usu.encerrar();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao_usu.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
 //Funcionando
}
