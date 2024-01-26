/*
* Fazer um aplicativo que receba valores double
* Usar Math.floor(valor + 0.5) para arredondar
* Imprimir ambos os números
*/

import java.util.Scanner;

public class main{
	public static void main(String args[]){
		
		System.out.println("Insira um número decimal: ");
		
		Scanner read = new Scanner(System.in);
		double value = read.nextDouble();
		
		double arredondado = arredonda(value);
		
		System.out.println("Digitou " + value +", foi arredondado para " + arredondado + ".");
	}
	
	public static double arredonda(double numero){
		double arredondar = Math.floor(numero + 0.5);
		
		return arredondar;
	}
}