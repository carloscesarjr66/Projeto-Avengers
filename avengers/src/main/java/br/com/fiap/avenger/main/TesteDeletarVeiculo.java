package br.com.fiap.avenger.main;

import javax.swing.JOptionPane;

import br.com.fiap.avenger.dao.VeiculoDAO;

public class TesteDeletarVeiculo {

	public static void main(String[] args) {
		VeiculoDAO dao_vei = null;  
		System.out.println("Deletar usuario");
		try {
			dao_vei = new VeiculoDAO(); 
			if(dao_vei.deletarVeiculo(JOptionPane.showInputDialog("Digite o codigo: ")) == 0) {
				System.out.println("Usuario não encontrado");
			} else {
				System.out.println("E morreu");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao_vei.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
//funcionando
}
