import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		char initialize = 'N';
		
		Scanner read = new Scanner(System.in);
		
		do{
			System.out.println("Preparado para o desafio? [Y/N]");
			initialize = read.next().charAt(0);
			
		}while(initialize == 'n' || initialize == 'N');
		
		int level = 0;
		try{
			System.out.println("ESCOLHA O NIVEL:\n");
			//System.out.println();
			System.out.println("****************");
			System.out.println("* 1. De 1-10   *\n* 2. De 1-100  *\n* 3. De 1-1000 *");
			System.out.println("****************\n");
			//System.out.println();
			level = read.nextInt();
		}catch(Exception error){
			level = 0;
			System.out.println("Ocorreu um erro!");
		}
		
		guessNumber number = new guessNumber();
		int chose = number.sortNumber(level);
		
		int input = -1; 
		switch(level){
			case 1:
				do{
					//System.out.println();
					System.out.println("\nADVINHE O NÚMERO DE 1 A 10:" );
					try{
						input = read.nextInt();
						number.setCountPalpite();
						System.out.println(number.palpite(input, chose));
					}catch(Exception error){
						System.out.println("Insira um palpite válido!");
						input = -1;
					}
				}while(input != chose);	
				break;
			case 2:
				do{
					//System.out.println();
					System.out.println("\nADVINHE O NÚMERO DE 1 A 100:");
					try{
						input = read.nextInt();
						number.setCountPalpite();
						System.out.println(number.palpite(input, chose));
					}catch(Exception error){
						System.out.println("Insira um palpite válido!");
						input = -1;
					}
					
				}while(input != chose);	
				break;
			case 3:
				do{
					//System.out.println();
					System.out.println("\nADVINHE O NÚMERO DE 1 A 1000:");
					try{
						input = read.nextInt();
						number.setCountPalpite();
						System.out.println(number.palpite(input, chose));
					}catch(Exception error){
						System.out.println("Insira um palpite válido!");
						input = -1;
					}
				}while(input != chose);	
				break;
			default:
				System.out.println("");
				break;
		}	
			
		if(input == chose){
			System.out.println("Parabens, voce adivinhou o numero!");
			number.getCountPalpite();
		}else{
			System.out.println("Tente mais uma vez!");
		}
		
		if(level < 1 || level > 3)
			System.out.println("Inseriu um nivel invalido");

	}//Main method
}//Main class