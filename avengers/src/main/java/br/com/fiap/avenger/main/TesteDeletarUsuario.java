package br.com.fiap.avenger.main;

import javax.swing.JOptionPane;

import br.com.fiap.avenger.dao.UsuarioDAO;

public class TesteDeletarUsuario {

	public static void main(String[] args) {
		UsuarioDAO dao_usu = null;  
		System.out.println("Deletar usuario");
		try {
			dao_usu = new UsuarioDAO(); 
			if(dao_usu.deletarUser(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: "))) == 0) {
				System.out.println("Usuario não encontrado");
			} else {
				System.out.println("E morreu");
			}
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
