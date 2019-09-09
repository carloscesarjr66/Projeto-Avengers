package br.com.fiap.avenger.model;
import java.util.Date;
public class Valet extends Veiculo {
	
	public int id_valet;
	public Date entrada;
	public Date saida;
	public double preco;
	public Veiculo veiculo;
	
	public Valet(int id_veiculo, String placa, String marca, String modelo, int id_valet, Date entrada, Date saida,
			double preco, Veiculo veiculo) {
		super(id_veiculo, placa, marca, modelo);
		this.id_valet = id_valet;
		this.entrada = entrada;
		this.saida = saida;
		this.preco = preco;
		this.veiculo = veiculo;
	}
	public Valet(int id_veiculo, String placa, String marca, String modelo) {
		super(id_veiculo, placa, marca, modelo);
	}
	public int getId_valet() {
		return id_valet;
	}
	public void setId_valet(int id_valet) {
		this.id_valet = id_valet;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
