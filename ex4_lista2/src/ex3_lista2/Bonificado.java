package ex3_lista2;

public class Bonificado extends Assalariado {

	private float bonificacao;
	
	public Bonificado(String nome,String sobrenome,float salarioBase,float bonificacao,float salarioSemanal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
		this.bonificacao = bonificacao;
		this.salarioSemanal = salarioSemanal;
	}

	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobrenome);
		System.out.println("Salario base: "+this.salarioBase);
		System.out.println("Salario semanal: "+this.salarioSemanal);
		System.out.println("Bonificação: "+this.bonificacao);
	}
	
	public void ganhos() {
		float total = salarioBase +  (salarioSemanal * 4) + bonificacao;
		System.out.println("Ganhos:"+total);
	}
}
