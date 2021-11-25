package ex8_lista2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EstacionamentoFacade {

	private ArrayList <Carros> carros;
	private ArrayList <Motocicletas> motocicletas; 
	
	public EstacionamentoFacade() {
		
	}

	public void start() {
		
		carros = new ArrayList<>();
		motocicletas = new ArrayList<>();
		
	}
	
	public void addCarros(Carros carro) {
		
		carros.add(carro);
		JOptionPane.showMessageDialog(null, "Carro estacionado");
	}
	
	public void addMotocicletas(Motocicletas moto) {
		
		motocicletas.add(moto);
		JOptionPane.showMessageDialog(null, "Motocicleta estacionada");
	}
	

}
