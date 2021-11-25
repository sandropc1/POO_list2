package ex8_lista2;

import javax.swing.JOptionPane;

public class Main {

	
	public Main() {
		
	}

	public static void main(String[] args) {
		
		EstacionamentoFacade estacionamento = new EstacionamentoFacade();
		
		estacionamento.start();
		JOptionPane.showMessageDialog(null, "Estacionamento facade inicializado");
		
		int resposta = JOptionPane.showConfirmDialog(null,"Você deseja estacionar um carro?");
		
		if(resposta == 0) {
			
			String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
			String ano = JOptionPane.showInputDialog("Digite o ano do "+ modelo + ":");
			
			Carros aux = new Carros(modelo,ano);
			estacionamento.addCarros(aux);
		}else {
			if(resposta == 2) {
				
				JOptionPane.showMessageDialog(null, "Cancelando programa");
				return;
			}
			
		}
		
		resposta = JOptionPane.showConfirmDialog(null,"Você deseja estacionar uma motocicleta?");
		
		if(resposta == 0) {
			
			String marca = JOptionPane.showInputDialog("Digite a marca da motocicleta: ");
			String placa = JOptionPane.showInputDialog("Digite a placa da motocicleta:");
			
			Motocicletas moto = new Motocicletas(marca,placa);
			estacionamento.addMotocicletas(moto);
		}else {
			if(resposta == 2) {
				
				JOptionPane.showMessageDialog(null, "Cancelando programa");
				return;
			}
			
		}	
		
	}

}
