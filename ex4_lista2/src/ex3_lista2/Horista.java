package ex3_lista2;

public class Horista extends Empregado {

	private float horas;
	
	public Horista(String nome,String sobrenome,float salarioBase,float horas) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
		this.horas = horas;
	}

	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobrenome);
		System.out.println("Salario: "+this.salarioBase);
		System.out.println("Horas: "+this.horas);
	}
	
	public void ganhos() {
		
		float total  = salarioBase + (horas * 30);
		System.out.println("Ganhos: "+ total);
	}
}
