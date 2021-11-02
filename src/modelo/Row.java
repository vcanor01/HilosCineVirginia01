package modelo;


import java.util.ArrayList;

public class Row {
	ArrayList<Seat> seats = new ArrayList<>();
	

	
	public Row() {
		super();
		this.seats = new ArrayList<>();;
		rellenarSeats();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}
	
	private void rellenarSeats() {
		for (int i = 0; i < 21; i++) {
			this.seats.add(new Seat(false,i));
		}
	}
	
	public Seat getConcreteSeat(int number) {
		return this.getSeats().get(number);
	}
	public boolean getConcreteSeatTaken(int number) {
		return this.getConcreteSeat(number).isTaken();
	}

	@Override
	public String toString() {
		return "Row [seats=" + seats + "]";
	}
	
	
	
	
	
	
}
