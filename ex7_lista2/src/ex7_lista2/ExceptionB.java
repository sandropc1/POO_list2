package ex7_lista2;

public class ExceptionB extends ExceptionA{

	private int numero;
	private int denominador;
	
	public ExceptionB() {
		
	}


	public ExceptionB(int num,int denom) {
		this.numero = num;
		this.denominador = denom;
	}

	
	public String toString() {
		
		return "Exception capturando uma Exception B: A divis�o n�o resulta em um n�mero inteiro";
	
	}
}
