package ex1_lista2;

public class Sapo extends Anfibio {

	public Sapo() {
		this.nome = "Kermit";
	}
	
	public void Nome() {
		System.out.println("O nome do sapo �: " + this.nome);
	}
	
	public void Status() {
		System.out.println("O sapo est� pulando");
		
	}
	
	public void Fome() {
		System.out.println("O sapo est� alimentado");
		
	}
	
	public void Sono() {
		System.out.println("O sapo est� cansado");
		
	}
	
	public void Humor() {
		System.out.println("O sapo est� de bom humor");
		
	}
}
