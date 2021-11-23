package ex1_lista2;

public class Sapo extends Anfibio {

	public Sapo() {
		this.nome = "Kermit";
	}
	
	public void Nome() {
		System.out.println("O nome do sapo é: " + this.nome);
	}
	
	public void Status() {
		System.out.println("O sapo está pulando");
		
	}
	
	public void Fome() {
		System.out.println("O sapo está alimentado");
		
	}
	
	public void Sono() {
		System.out.println("O sapo está cansado");
		
	}
	
	public void Humor() {
		System.out.println("O sapo está de bom humor");
		
	}
}
