package ex2_lista2;

public abstract class MembroUniversidade {

	public MembroUniversidade() {
		
	}
	public void Relatorio() {
		
	    this.Status();
		this.Localiza��o();
		this.Disponibilidade();
		this.Fome();
		this.Humor();
	}
	public abstract void Status();
	
	public abstract void Localiza��o();
	
	public abstract void Disponibilidade();
	
	public abstract void Fome();
	
	public abstract void Humor();
}
