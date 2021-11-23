package ex2_lista2;

public abstract class MembroUniversidade {

	public MembroUniversidade() {
		
	}
	public void Relatorio() {
		
	    this.Status();
		this.Localização();
		this.Disponibilidade();
		this.Fome();
		this.Humor();
	}
	public abstract void Status();
	
	public abstract void Localização();
	
	public abstract void Disponibilidade();
	
	public abstract void Fome();
	
	public abstract void Humor();
}
