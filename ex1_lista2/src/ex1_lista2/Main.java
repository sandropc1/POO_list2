package ex1_lista2;

import java.util.ArrayList;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Sapo sapo = new Sapo();
		Rã rã = new Rã();
		Leão leão = new Leão();
		Macaco macaco = new Macaco();
		
		ArrayList <Animal> lista = new ArrayList<Animal>();
		lista.add(sapo);
		lista.add(macaco);
		lista.add(rã);
		lista.add(leão);
		
		for(int i = 0; i < lista.size();i++) {
			
			Animal aux = new Animal();
			aux = lista.get(i);
			aux.Relatorio();
			System.out.println("\n");
		}
	}

}
