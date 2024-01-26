public class DigitSeparator {
	public DigitSeparator(){
		
	}
	
	public int division(int number1, int number2){
		int result = number1 / number2;
		return result;
	}
	
	public int resto(int number1, int number2){
		int result = number1 % number2;
		return result;
	}
	
	public void displayDigits(int number){
		String convert = String.valueOf(number);
		
		for(int i = 0; i < convert.length(); i++){
			System.out.print(convert.charAt(i) + "  ");
		}
		System.out.println("");
	}
	
	public void isPerfect(int number){
		double soma = 0;
		for(int i = 0; i < number; i++){
			if(i == number){
				System.out.println(i);
			}
		}
	}
	
	public void invertDigit(double number){
		String convertDigit = String.valueOf(number);
		
		char digit;
		StringBuilder text;
		
		for(int i = convertDigit.length(); i > 0; i--){
			digit = convertDigit.charAt(i - 1);
			text = new StringBuilder();
			
			if(text.contains("[0-9]") && text.charAt(1) == "."){
				text.append(digit);
			}else{
				text.append(".");
				text.append(digit);
			}
		}
		
		String show = String.valueOf(text);
	}
}