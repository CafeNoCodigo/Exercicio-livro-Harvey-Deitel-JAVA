import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		double number1 = read.nextDouble();
		
		//System.out.println("Insira um número inteiro: ");
		//int number2 = read.nextInt();
		
		DigitSeparator divid = new DigitSeparator();
		//System.out.println(divid.division(number1, number2));
		
		//System.out.println(divid.resto(number1, number2));
		
		//divid.displayDigits(number1);
		
		//divid.isPerfect(number1);
		
		divid.invertDigit(number1);
	}
}