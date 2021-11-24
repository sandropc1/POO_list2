package ex3_lista2;

public class BitCoin implements IConversorMoeda{

	float quantBitcoin = 2;
	float total = 0;
	
	float conversaoEuro = (float) 49994.26;
	float conversaoReal = (float) 314272.71;
	float conversaoDolar = (float) 56014.10;
	
	
	
	
	public BitCoin() {
		
	}

	
		public float getConversaoReal() {
		
			total = quantBitcoin * conversaoReal;
			System.out.println("Conversão Bitcoin -> Real: "+ total);
			
		return total;
		}
	
	
		public float getConversaoEuro() {
			
			total = quantBitcoin * conversaoEuro;
			System.out.println("Conversão Bitcoin -> Euro: "+ total);
			
		return total;
		}
		
		
		public float getConversãoDolar() {
			
			total = quantBitcoin * conversaoDolar;
			
			System.out.println("Conversão BitCoin -> Dolar: "+ total);
			
		return total;
		}
		
	}

