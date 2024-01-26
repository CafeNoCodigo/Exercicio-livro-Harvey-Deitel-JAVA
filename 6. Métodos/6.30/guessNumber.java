import java.security.SecureRandom;

public class guessNumber{
	private int countPalpite = 0;
	
	public guessNumber(){
		
	}
	
	//Sorteia um número baseado no vivel escolhido
	public int sortNumber(int level){
		SecureRandom sort = new SecureRandom();
		int number = 0;
		
		switch(level){
			case 1:
				number = sort.nextInt(10 + 1);
				break;
			case 2:
				number = sort.nextInt(100 + 1);
				break;
			case 3:
				number = sort.nextInt(1000 + 1);
				break;
		}
		return number;
	}
	
	//Caso o usuario insira um palpite alto ou baixo
	public String palpite(int palpite, int randomNumber){
		if(palpite > randomNumber && palpite != randomNumber){
			return "Muito alto!";
		}else if(palpite < randomNumber && palpite != randomNumber){
			return "Muito Baixo!";
		}
		
		return "";
	}
	
	public void setCountPalpite(){
		this.countPalpite++;
	}
	
	public void getCountPalpite(){
		if(this.countPalpite < 10){
			System.out.println("Voce descobriu o segredo ou tem muita sorte!");
		}else if(this.countPalpite == 10){
			System.out.println("Ah! Voce descobriu o segredo.");
		}else{
			System.out.println("Voce deve ser capaz de fazer melhor!");
		}
	}
}