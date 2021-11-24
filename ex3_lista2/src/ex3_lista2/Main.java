package ex3_lista2;

import java.util.ArrayList;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		BitCoin bc = new BitCoin();
		Euro eu = new Euro();
		Real rs = new Real();
		
		ArrayList <IConversorMoeda> lista = new ArrayList<IConversorMoeda>();
		
		lista.add(bc);
		lista.add(eu);
		lista.add(rs);
		
		for(IConversorMoeda moeda : lista) {
			moeda.getConversãoDolar();
			System.out.println("\n");
		}
	}

}
