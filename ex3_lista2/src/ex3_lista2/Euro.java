package ex3_lista2;

public class Euro implements IConversorMoeda{

	float quantEuro = 500;
	float total = 0;
	
	float conversaoReal = (float) 6.28;
	float conversaoBitcoin = (float) 0.000024;
	float conversaoDolar = (float) 1.12;
	
	public Euro() {
		
	}

	public float getConversaoReal() {
		
		total = quantEuro * conversaoReal;
		System.out.println("Convers�o Euro -> Real: "+ total);
	return total;
	}
	
	public float getConvers�oDolar() {
		
		total = quantEuro * conversaoDolar;
		
		System.out.println("Convers�o Euro -> Dolar: "+ total);
		return total;
	}

	public float getConversaoBitCoin(){
		
		total = quantEuro * conversaoBitcoin;
		
		System.out.println("Convers�o Euro -> Bitcoin: "+ total);
		return total;
	}
}
