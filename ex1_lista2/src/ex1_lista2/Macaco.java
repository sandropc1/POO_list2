package ex1_lista2;

public class Macaco extends Terrestre{

	public Macaco() {
		this.nome = "Wukong";
	}

	public void Nome() {
		System.out.println("O nome do macaco �: " + this.nome);
	}
	
	public void Status() {
		System.out.println("O macaco est� comendo bananas");
		
	}
	
	public void Fome() {
		System.out.println("O macaco est� se alimentando");
		
	}
	
	public void Sono() {
		System.out.println("O macaco est� descansado");
		
	}
	
	public void Humor() {
		System.out.println("O macaco est� de bom humor");
		
	}
}
