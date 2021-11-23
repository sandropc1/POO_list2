package ex3_lista2;

public class Comissionado extends Empregado {

	private float taxaComissao;
	
	public Comissionado(String nome,String sobrenome,float salarioBase,float taxaComissao) {
	
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
		this.taxaComissao = taxaComissao;
	}

	public void ganhos() {
		
		float taxaCorrigida = taxaComissao / 100;
		float total = salarioBase + (1000 * taxaCorrigida);
		
		System.out.println("Total: "+ total);
	}
	
	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobrenome);
		System.out.println("Salario base: "+this.salarioBase);
		System.out.println("Taxa de comissão: "+this.taxaComissao);
	}
}
