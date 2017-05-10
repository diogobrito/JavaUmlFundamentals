package br.com.fiap;

public class ArraysActivity {
	public static void calcOnArrays(int[] intArray){		
		// Calcula maximo
		int actualValue = Integer.MIN_VALUE;
		int previousValue = Integer.MIN_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (int i : intArray) {
			actualValue = i;

			if(actualValue > previousValue){
				maxValue = actualValue;
			}
			
			previousValue = actualValue;
		}
		
		System.out.println("Valor maximo: " + maxValue);

		// Calcula minimo
		actualValue = Integer.MAX_VALUE;
		previousValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		
		for (int i : intArray) {
			actualValue = i;

			if(actualValue < previousValue){
				minValue = actualValue;
			}
			
			previousValue = actualValue;
		}
		
		System.out.println("Valor minimo: " + minValue);

		// Soma do array
		int summary = 0;
		
		for (int i : intArray) {
			summary += i;
			// summary = summary + i;
		}
		
		System.out.println("Soma do array: " + summary);
		
		// Media do Array
		float medium = 0;
		
		medium = (float)summary / intArray.length;
		
		System.out.println("Media do array: " + medium);
	}
}
