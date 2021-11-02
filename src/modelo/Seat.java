package modelo;


public class Seat {
	public boolean taken;
	private int number;

	public Seat(boolean taken, int number) {
		super();
		this.taken = taken;
		this.number = number;
	}

	public boolean isTaken() {
		if(taken== true) {
			return taken;
		}else {
			return false;
		}
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Seat [taken=" + taken + ", number=" + number + "]";
	}
	
	
	
	
}
