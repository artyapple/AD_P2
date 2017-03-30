package org.AD_P2.Algorithmen;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {2,4,100,657, 1675952136, 123456789, 999777,21383, 24282607 };
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < numbers.length;i++){
			int check = numbers[i];
			long startT1 = System.currentTimeMillis();
			boolean bool1 = FermatTestExample.checkPrime(BigInteger.valueOf(check), 20);
			str.append("Fermat check: " + check + " result: " + bool1 + " time: "+(System.currentTimeMillis() - startT1));
			str.append("\n"); 
			
			long startT2 = System.currentTimeMillis();
			boolean bool2 = PrimzahlCheck.primzahlen(check);
			str.append("Normal check: " + check + " result: " + bool2 + " time: "+(System.currentTimeMillis() - startT2));
			str.append("\n"); 			
		}		
		System.out.println(str);
	}
}
