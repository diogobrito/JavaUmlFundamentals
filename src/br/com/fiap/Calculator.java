package br.com.fiap;

public class Calculator {
	public static String toBinary(int entryNumber){
		int actualValue = entryNumber;
		String binary = "";
		
		if(entryNumber == 0){
			binary = "0";
		}else{
			while(actualValue > 0){
				binary = Integer.toString(actualValue % 2) + binary;
						
				actualValue = actualValue / 2;
			}
		}
		
		return binary;
	}
	
	public static double calc(double value1, double value2){
		return 2d;
	}
	
	public static int fatorial(int entryValue){
		int value = entryValue;
				
		for(int i = entryValue - 1; i >= 1; i--){
			value = value * i;
		}
	    				
		return value;
	}
}
