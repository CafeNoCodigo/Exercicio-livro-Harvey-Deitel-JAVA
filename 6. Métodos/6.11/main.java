/*
* Escreva instruções que atribuam números inteiros aleátorios nos intervalos:
* a) 1 <= n <= 2 A
* b) 1 <= n <= 100 B
* c) 0 <= n <= 9 C
* d) 1000 <= n <= 1112 D
* e) -1 <= n <= 1 E
* f) -3 <= n <= 11 F
* g) 2, 4, 6, 8, 10 G
* h) 3, 5, 7, 9, 11 H
* i) 6, 10, 14, 18, 22 I
*/

import java.security.SecureRandom;

public class main{
	public static void main(String[] args){
		SecureRandom numeroAleatorio = new SecureRandom();
		
		/*
		int control = 0;
		while(control < 5){
			// 1-2
			int numeroA = numeroAleatorio.nextInt(2) + 1;
			System.out.println(numeroA);

			control++;
		}
		System.out.println("");
		
		control = 0;
		while(control < 3){
			// 1-100
			int numeroB = numeroAleatorio.nextInt(100) + 1;
			System.out.println(numeroB);
			
			control++;
		}
		
		System.out.println("");
		
		control = 0;
		while(control < 3){
			// 0 - 9
			int numeroC = numeroAleatorio.nextInt(10);
			System.out.println(numeroC);
			
			control++;
		}
		*/
		
		int numero[] = {2, 4, 6, 8, 10};
		int numeroA = numeroAleatorio.nextInt(5);
		
		System.out.println(numero[numeroA]);
	}
}