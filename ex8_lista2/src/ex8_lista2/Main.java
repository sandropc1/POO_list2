package ex8_lista2;

import javax.swing.JOptionPane;

public class Main {

	
	public Main() {
		
	}

	public static void main(String[] args) {
		
		EstacionamentoFacade estacionamento = new EstacionamentoFacade();
		
		estacionamento.start();
		JOptionPane.showMessageDialog(null, "Estacionamento facade inicializado");
		
		Carros celta = new Carros();
		Motocicletas hondalit = new Motocicletas("Honda","SNT2002");

		estacionamento.start();
		
		estacionamento.addCarros(celta);
		estacionamento.addMotocicletas(hondalit);
		
		
	}

}
