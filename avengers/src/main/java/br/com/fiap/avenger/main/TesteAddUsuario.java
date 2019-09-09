package br.com.fiap.avenger.main;

import javax.swing.JOptionPane;

import br.com.fiap.avenger.dao.UsuarioDAO;
import br.com.fiap.avenger.model.Usuario;

public class TesteAddUsuario {

	public static void main(String[] args) {
		UsuarioDAO dao_usu = null; 
		try {
			dao_usu = new UsuarioDAO(); 
			Usuario u = new Usuario();  
			u.setId_usuario(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: ")));
			u.setNome_usuario(JOptionPane.showInputDialog("Digite o nome: ")); 
			u.setEmail_usuario(JOptionPane.showInputDialog("Digite o email: ")); 
			u.setSenha_usuario(JOptionPane.showInputDialog("Digite a senha: ")); 
			if(dao_usu.addUser(u) == 0) {
				System.out.println("Usuario não cadastrado");
			} else {
				System.out.println("Usuario cadastrado com sucesso");
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				dao_usu.encerrar();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
//Funcionando
}
