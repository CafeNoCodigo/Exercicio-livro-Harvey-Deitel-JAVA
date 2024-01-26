/*
* Estacionamento cobra 2 reais por 3 horas.
* Depois dessas 3 horas é cobrada 0.50 centavos por cada hora.
* A tarifa máxima por 24horas é de 10 reais.
* Escreva um aplicativo que calcule e exiba as tarifas para cada cliente que estacionou ontem.
* Inserir manualmente as horas de estacionamento/ para melhorar pode registrar a hora de entrada e a de 
*saida para determinar a hora total de estacionamento.
* Calcular e exibir os recibos de ontem.
* Usar um método para determinar a tarifa para cada cliente
*/
import java.util.Scanner;

public class Exercicio8 {
	public static void main (String args[]){
		Scanner read = new Scanner(System.in);
		
		int control = 1;
		while(control > 0){
			System.out.println("Insira o número de horas que estacionou:    ");
			System.out.println("Digite um número negativo para terminar!");
			
			int value = read.nextInt();
			CalculateCharges client_01 = new CalculateCharges(value);
			client_01.calcPayment(); 	
			
			control = value;
		}
	}
}