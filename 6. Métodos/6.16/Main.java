/*
* Escreva um método que determina se o segundo número é múltiplo do primeiro
* Retorna true se sim e false se não
* Ler dados do úsuario
*/

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int numero_1 = read.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int numero_2 = read.nextInt();
		
		Exercicios multiplo = new Exercicios();
		
		System.out.println("Multiplo: " + multiplo.isMultiple(numero_1, numero_2));
		
		System.out.println(multiplo.isEven(numero_1));
		System.out.println(multiplo.isEven(numero_2));
	}
}