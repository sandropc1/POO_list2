package ex1_lista2;

public class Macaco extends Terrestre{

	public Macaco() {
		this.nome = "Wukong";
	}

	public void Nome() {
		System.out.println("O nome do macaco é: " + this.nome);
	}
	
	public void Status() {
		System.out.println("O macaco está comendo bananas");
		
	}
	
	public void Fome() {
		System.out.println("O macaco está se alimentando");
		
	}
	
	public void Sono() {
		System.out.println("O macaco está descansado");
		
	}
	
	public void Humor() {
		System.out.println("O macaco está de bom humor");
		
	}
}
