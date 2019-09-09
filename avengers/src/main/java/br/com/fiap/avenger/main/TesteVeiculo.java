package br.com.fiap.avenger.main;

import javax.swing.JOptionPane;

import br.com.fiap.avenger.dao.VeiculoDAO;
import br.com.fiap.avenger.model.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		VeiculoDAO dao_vei = null;
		try {
			dao_vei = new VeiculoDAO();
			Veiculo v = new Veiculo();
			v.setPlaca(JOptionPane.showInputDialog("Digite a placa:")); 
			v = dao_vei.getVeiculo(v.getPlaca());
			System.out.println("Placa: " + v.getPlaca()); 
			System.out.println("Marca: "+ v.getMarca()); 
			System.out.println("Modelo: "+ v.getModelo()); 
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

}
