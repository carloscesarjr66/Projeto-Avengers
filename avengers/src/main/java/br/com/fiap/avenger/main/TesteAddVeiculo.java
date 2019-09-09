package br.com.fiap.avenger.main;

import javax.swing.JOptionPane;

import br.com.fiap.avenger.dao.VeiculoDAO;
import br.com.fiap.avenger.model.Veiculo;

public class TesteAddVeiculo {

	public static void main(String[] args) {
		VeiculoDAO dao_vei = null; 
		try {
			dao_vei = new VeiculoDAO(); 
			Veiculo v = new Veiculo(); 
			v.setId_veiculo(Integer.parseInt
					(JOptionPane.showInputDialog("Digite o ID do veiculo: "))); 
			v.setPlaca(JOptionPane.showInputDialog("Digite a placa: ")); 
			v.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
			v.setModelo(JOptionPane.showInputDialog("Digite o modelo: ")); 
			if(dao_vei.addVeiculo(v) == 0) {
				System.out.println("Veiculo não cadastrado");
			} else {
				System.out.println("Veiculo cadastrado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao_vei.encerrar();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		//funcionando
	}

}
