package br.com.fiap;
// Not Working!!!
public class Calculator {
	public static String toBinary(int number){
		int result = number;
		String binary = "";
		
		if(number == 0){
			binary = "0";
		}else{
			while(result > 0){
				binary = binary + Integer.toString(result % 2);
						
				result = result / 2;
			}
			
			binary = binary + "0";
		}
		
		return binary;
	}
}
