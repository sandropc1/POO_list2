package ex8_lista2;

import javax.swing.JOptionPane;

public class Motocicletas {

	String marca;
	String placa;
	
	public Motocicletas() {
		JOptionPane.showMessageDialog(null, "Motocicleta cadastrada");
	}

	
	public Motocicletas(String marca, String placa) {
		this.marca = marca;
		this.placa = placa;
		JOptionPane.showMessageDialog(null, "Motocicleta cadastrada");
	}
	
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public void setAno(String placa) {
		
		this.placa = placa;
	}
	
}
