package ex5_lista2;

public class Divis�o implements IOperacoes{

	String nome = "Divis�o";
	float operando1;
	float operando2;
	float resultado;
	int instancias = 0;
	
	public Divis�o() {
		this.instancias++;
	}

	public void setOperando1(float operando1) {
		
		this.operando1 = operando1;	
	}


	public void setOperando2(float operando2) {
		
		this.operando2 = operando2;
	}


	public float getResultado() {
		
		resultado = this.operando1 / this.operando2;
		
		return resultado;
	}


	public String getNome() {
		
		return this.nome;
	}


	public int getQuantidade() {
		
		return instancias;
	}

}
