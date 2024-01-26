/*
* Criar um programa que arredonda para casas decimais especifias
* roundToInteger -- Math.floor(x + 0.5)
* roundToTenths -- Math.floor(x * 10 + 0.5) / 10
* roundToHundredths -- Math.floor (x * 100 + 0.5) / 100
* roundToThousandths -- Math.floor(x * 1000 + 0.5) / 1000 
*/

import java.util.Scanner;

public class main {
	public static void main(String args[]){
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira um número com ponto flutuante: ");
		float number = read.nextFloat();
		
		System.out.println(number);
		System.out.println(roundToInteger(number));
		System.out.println(roundToTenths(number));
		System.out.println(roundToHundredths(number));
		System.out.println(roundToThousandths(number));
	}
	
	public static float roundToInteger(float number){
		float round = (float) Math.floor(number + 0.5);
		
		return round;
		
	}
	
	public static float roundToTenths(float number){
		float round = (float) Math.floor(number * 10 + 0.5) / 10;
		
		return round;
		
	}
	
	public static float roundToHundredths(float number){
		float round = (float) Math.floor(number * 100 + 0.5) / 100;
		
		return round;
		
	}
	
	public static float roundToThousandths(float number){
		float round = (float) Math.floor(number * 1000 + 0.5) / 1000;
		
		return round;
		
	}
}