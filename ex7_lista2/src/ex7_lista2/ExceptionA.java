package ex7_lista2;

public class ExceptionA extends Exception {

	private int numero;
	private int denominador;
	
	
	public ExceptionA() {
		
	}
	
	public ExceptionA(int num,int denom) {
		this.numero = num;
		this.denominador = denom;
	}

	
	public String toString() {
		
		return "Exception capturando uma ExceptionA: Denominador igual a zero, divisão invalidada";
	}
}
