package ex8_lista2;

import javax.swing.JOptionPane;

public class Carros {

	String modelo;
	String ano;
	
	public Carros() {
		
		JOptionPane.showMessageDialog(null, "Carro cadastrado");
	}
	
	public Carros(String modelo,String ano) {
		
		this.modelo = modelo;
		this.ano = ano;
		JOptionPane.showMessageDialog(null, modelo +" "+ ano +" cadastrado");
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public void setAno(String ano) {
		
		this.ano = ano;
	}
	

}
