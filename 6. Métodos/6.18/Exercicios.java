public class Exercicios{
	
	public Exercicios(){
		
	}
	
	// Calcula a hipotenusa
	public double hypot(double co, double ca){
		double resultado = Math.pow(co, 2) + Math.pow(ca, 2);
		double result = Math.sqrt(resultado);
		
		return result;
	}
	
	// Define se o segundo numero é múltiplo do primeiro
	public boolean isMultiple(int numero_1, int numero_2){
		if(numero_2 % numero_1 == 0){
			return true;
		}
		return false;
	}
	
	// Determina se um número é par ou ímpar
	public boolean isEven(int numero){
		if(numero % 2 == 0){
			System.out.print("O número " + numero + " é par?  ");
			return true;
		}else{
			System.out.print("O número " + numero + " é par?  ");
			return false;
		}
	}
	
	// Desenha com asteristicos 
	public void squareOfAsteristiks(int numero, char fill){
		for(int i = 0; i < numero; i++){
			System.out.println();
			
			for(int y = 0; y < numero; y++){
				System.out.print(fill);
			}
		}
	}
}