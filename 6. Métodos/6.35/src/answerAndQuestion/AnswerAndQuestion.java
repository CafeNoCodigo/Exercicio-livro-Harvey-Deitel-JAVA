package answerAndQuestion;

import java.security.SecureRandom;

import view.view;


public class AnswerAndQuestion {
	private SecureRandom number = new SecureRandom();
	private StringBuilder makeQuestion = new StringBuilder();
	private int randomNumber_1;
	private int randomNumber_2;
	private view moreQuestion = new view();
	
	public AnswerAndQuestion() {
		
	}
	
	//Informa a questão com números aleátorios
	public String question() {
		makeQuestion.delete(0, makeQuestion.length());
		makeQuestion.append("Quanto é ");
		
		setRandomNumber_1();
		makeQuestion.append(getRandomNumber_1() + " vezes ");
		
		setRandomNumber_2();
		makeQuestion.append(getRandomNumber_2() + "?");
		
		return makeQuestion.toString();
	}
	
	public int answer() {
		int result = (getRandomNumber_1() * getRandomNumber_2());
		return result;
	}
	
	public String whenCorrect(int randomNumber) {
		if(randomNumber == 1) {
			return "Muito Bom!";
		}else if(randomNumber == 2) {
			return "Maravilhoso, esta num óptimo caminho.";
		}else if(randomNumber == 3) {
			return "Você acertou, parabéns";
		}else if(randomNumber == 4) {
			return "Maravilhoso!";
		}
		return "Mantenha um bom trabalho!";
	}
	
	public String whenWrong(int randomNumber) {
		if(randomNumber == 1) {
			return "Pense Melhor.";
		}else if(randomNumber == 2) {
			return "Estude Um Pouco Mais!";
		}else if(randomNumber == 3) {
			return "Tenha Paciência.";
		}else if(randomNumber == 4) {
			return "Nada esta fácil!";
		}
		return "Continue tentando!";
	}
	
	
	//Área dos getters e setters
	private void setRandomNumber_1() {
		if(moreQuestion.getCountCorrrect() < 5) {
			randomNumber_1 = number.nextInt(9) + 1;
		}else {
			randomNumber_1 = number.nextInt(19) + 1;
		}
	}
	
	private void setRandomNumber_2() {
		randomNumber_2 = number.nextInt(9) + 1;
	}
	
	public int getRandomNumber_1() {
		return randomNumber_1;
	}
	
	public int getRandomNumber_2() {
		return randomNumber_2;
	}

}
