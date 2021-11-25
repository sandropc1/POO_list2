package ex8_lista2;

import javax.swing.JOptionPane;

public class Carros {

	String modelo;
	int ano;
	
	public Carros() {
		JOptionPane.showMessageDialog(null, "Carro cadastrado");
	}
	

	public Carros(String modelo,int ano) {
		
		this.modelo = modelo;
		this.ano = ano;
		JOptionPane.showMessageDialog(null, "Carro cadastrado");
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		
		this.ano = ano;
	}
	

}
