/*
* (Cálculos de hipotenusa) Defina um método que calcula a hipotenusa de um triângulo retângulo
* quando são dados os comprimentos dos outros dois lados. O método deve tomar dois argumentos 
* do tipo double e retornar a hipotenusa como um double.
* Incorpore esse método a um aplicativo que lê valores para side1 e side2 e realiza o cálculo
* com o método hypotenuse. Utilize os métodos Math pow e sqrt para determinar o tamanho da 
* hipotenusa de cada um dos triângulos. [Observação: a classe Math também fornece
* o método hypot para realizar esse cálculo.]
* h² = cateto oposto² + cateto adjacente²
*/

import java.util.Scanner;

public class main{
	
	public static double hypot(double co, double ca){
		double resultado = Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
		
		return resultado;
	}
	
	public static void main(String args[]){
		Scanner read = new Scanner (System.in);
		
		System.out.println("Insira o valor do cateto oposto: ");
		double co = read.nextDouble();
		
		System.out.println("Insira o valor do cateto adjacente: ");
		double ca = read.nextDouble();
		
		System.out.println(Math.hypot(co, ca)); // Usando a classe o método hypot da classe Math
		System.out.println(hypot(co, ca)); // Usando uma classe própria
	}
}