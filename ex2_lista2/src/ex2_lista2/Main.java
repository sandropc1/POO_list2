package ex2_lista2;

import java.util.ArrayList;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Administrativo administrativo = new Administrativo();
		Professor professor = new Professor();
		Técnico técnico = new Técnico();
		Bolsista bolsista = new Bolsista();
		
		
		ArrayList <MembroUniversidade> lista = new ArrayList<MembroUniversidade>();
		lista.add(administrativo);
		lista.add(professor);
		lista.add(técnico);
		lista.add(bolsista);
		
		for(int i = 0; i < lista.size();i++) {
			
			lista.get(i);
			(lista.get(i)).Relatorio();
			System.out.println("\n");
		}

	}
}
