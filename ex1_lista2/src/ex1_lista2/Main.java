package ex1_lista2;

import java.util.ArrayList;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Sapo sapo = new Sapo();
		R� r� = new R�();
		Le�o le�o = new Le�o();
		Macaco macaco = new Macaco();
		
		ArrayList <Animal> lista = new ArrayList<Animal>();
		lista.add(sapo);
		lista.add(macaco);
		lista.add(r�);
		lista.add(le�o);
		
		for(int i = 0; i < lista.size();i++) {
			
			Animal aux = new Animal();
			aux = lista.get(i);
			aux.Relatorio();
			System.out.println("\n");
		}
	}

}
