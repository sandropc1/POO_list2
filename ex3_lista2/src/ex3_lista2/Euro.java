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
		System.out.println("Conversão Euro -> Real: "+ total);
	return total;
	}
	
	public float getConversãoDolar() {
		
		total = quantEuro * conversaoDolar;
		
		System.out.println("Conversão Euro -> Dolar: "+ total);
		return total;
	}

	public float getConversaoBitCoin(){
		
		total = quantEuro * conversaoBitcoin;
		
		System.out.println("Conversão Euro -> Bitcoin: "+ total);
		return total;
	}
}
