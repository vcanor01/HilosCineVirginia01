package modelo;
import java.util.Random;

public class GeneradorRequestRandom {
	
	int number;
	char letter;
	
	public GeneradorRequestRandom() {
		super();
		this.number = randomNumber();
		this.letter = randomLetter();
	}
	
	private int randomNumber() {
		int randomNumber = (int) (Math.random()*21);
		return randomNumber;
	}
	private char randomLetter() {
		Random r = new Random();
		char randomLetter = (char)(r.nextInt(15) + 'A');
		return randomLetter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	
	
	
}
