package br.com.fiap.avenger.model;

public class Veiculo {
	
	public int id_veiculo;
	public String placa;
	public String marca;
	public String modelo;

	public Veiculo(int id_veiculo, String placa, String marca, String modelo) {
		super();
		this.id_veiculo = id_veiculo;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Veiculo() {
		super();
	}

	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
