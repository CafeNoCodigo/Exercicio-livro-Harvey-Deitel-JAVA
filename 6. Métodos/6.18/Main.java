import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		int numero = read.nextInt();
		
		System.out.println("Insira uma letra, número ou caracter especial: ");
		char fill = read.next().charAt(0);
		
		Exercicios square = new Exercicios();
		square.squareOfAsteristiks(numero, fill);
	}
}