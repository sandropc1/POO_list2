package ex3_lista2;

public class Real implements IConversorMoeda{
	
	float quantReal = 750;
	float total = 0;
	
	float conversaoEuro = (float) 0.16;
	float conversaoBitcoin = (float) 0.0000039;
	float conversaoDolar = (float) 0.18;
	
	
	public Real() {
		
	}
	
	public float getConversaoEuro() {
		
		total = quantReal * conversaoEuro;
		System.out.println("Convers�o Real -> Euro: "+ total);
		
	return total;
	}
	
	
	public float getConvers�oDolar() {
		
		total = quantReal * conversaoDolar;
		
		System.out.println("Convers�o Real -> Dolar: "+ total);
		
	return total;
	}

	public float getConversaoBitCoin(){
		
		total = quantReal * conversaoBitcoin;
		
		System.out.println("Convers�o Real -> Bitcoin: "+ total);
		
	return total;
	}
}
