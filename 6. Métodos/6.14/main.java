/*
* Escreva um método que faça o cálculo de potencias
* NB: Não use a classe Math
*/

import java.util.Scanner;

public class main{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira a base: ");
		int base = read.nextInt();
		
		System.out.println("Insira o expoente: ");
		int exp = read.nextInt();
		
		System.out.println(potenciaInteiro(base, exp));
	}
	
	// Método que faz o cálculo
	public static int potenciaInteiro(int base, int exp){
		int resultado = 1; // Somente para números inteiros positivos e sempre que o expoente for zero
		int control = 0;
		while(control < exp){
			resultado *= base;
			
			control++;
		}
		
		return resultado;
	}
}