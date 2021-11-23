package ex3_lista2;

import java.util.ArrayList;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Bonificado b1 = new Bonificado("Yuri","Schwab",1500,45,46);
		Comissionado c1 = new Comissionado("Allas","Assis",1500,10);
		Horista h1 = new Horista("Jonathan","Rocha",1500,16);
		
		ArrayList <Empregado> lista = new ArrayList<Empregado>();
		
		lista.add(b1);
		lista.add(c1);
		lista.add(h1);
		
		for(Empregado empregado : lista) {
			empregado.imprimir();
			empregado.ganhos();
			System.out.println("\n");
		}
	}

}
