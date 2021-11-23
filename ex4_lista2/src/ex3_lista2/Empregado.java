package ex3_lista2;

public abstract class Empregado {

	protected String nome;
	protected String sobrenome;
	protected float salarioBase;
	
	public Empregado() {
		
	}

	public abstract void ganhos();
	
	public abstract void imprimir();


}