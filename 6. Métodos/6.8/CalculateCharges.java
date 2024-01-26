public class CalculateCharges {
	
	private int horas;
	
	public CalculateCharges(int horas){
		this.horas = horas;
	}
	
	public double calcPayment(){
		
		double result;
		
		if((this.horas > 0) && (this.horas <= 3)){
			System.out.println(2);
			return result = 2;
		}else if(this.horas > 3 && this.horas < 24){
			result = 3 + ((this.horas - 3) * 0.50);
			System.out.println(result);
			return result;
		}else{
			System.out.println(10);
			return result = 10;
		}
	}
	
}