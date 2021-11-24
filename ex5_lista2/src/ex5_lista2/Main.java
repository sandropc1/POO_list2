package ex5_lista2;

import java.util.ArrayList;


public class Main {
	

	public Main() {
		
	}

	public static void main(String[] args) {
		
		float ope1 = 10;
		float ope2 = 2;
		String nome;
		float resultado;
		int instancias;
		
		Soma sum = new Soma();
		Subtra��o sub = new Subtra��o();
		Multiplica��o multi = new Multiplica��o();
		Divis�o divi = new Divis�o();
	
		ArrayList <IOperacoes> lista = new ArrayList<IOperacoes>();
		
		lista.add(sum);
		lista.add(sub);
		lista.add(multi);
		lista.add(divi);
		
		for(IOperacoes ope : lista) {
			ope.setOperando1(ope1);
			System.out.println("Operador 1: "+ ope1);
			ope.setOperando2(ope2);
			System.out.println("Operador 2 "+ ope2);
			
			nome = ope.getNome();
			System.out.println("Opera��o: "+ nome);
			
			resultado = ope.getResultado();
			System.out.println("Resultado: "+ resultado);
			
			instancias = ope.getQuantidade();
			System.out.println("Instancias: "+ instancias);
			
			System.out.println("\n");
		}
		
		
	}

}
