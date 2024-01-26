public class ExerciciosMetodos {
	public static void main(String[] args){
		
		double x = Math.abs(7.5);
		System.out.println(x);
		
		x = Math.floor(7.5);
		System.out.println(x);
		
		x = Math.abs(0.0);
		System.out.println(x);
		
		x = Math.ceil(0.0);
		System.out.println(x);
		
		x = Math.abs(-6.4);
		System.out.println(x);
		
		x = Math.ceil(-6.4);
		System.out.println(x);
		
		x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.println(x);
	}
}