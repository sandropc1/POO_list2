package ex1_lista2;

public class Animal {

String nome;

	
	public Animal() {
		
	}
	
	public void Relatorio() {
		
		this.Nome();
		this.Status();
		this.Fome();
		this.Sono();
		this.Humor();
	}

	public void Nome() {
		System.out.println("O nome do animal �: " + this.nome);
	}
	
	public void Status() {
		System.out.println("O animal est� vivo");
		
	}
	
	public void Fome() {
		System.out.println("O animal est� alimentado");
		
	}
	
	public void Sono() {
		System.out.println("O animal est� descansado");
		
	}
	
	public void Humor() {
		System.out.println("O animal est� de bom humor");
		
	}
	
	
}
