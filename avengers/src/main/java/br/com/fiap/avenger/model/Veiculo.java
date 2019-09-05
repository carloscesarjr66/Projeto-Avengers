package br.com.fiap.avenger.model;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;

	public Veiculo(String placa, String marca, String modelo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Veiculo() {
		super();
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
