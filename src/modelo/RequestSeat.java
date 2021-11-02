package modelo;


public class RequestSeat {
	public char row;
	public int seat;
	
	public RequestSeat(char row, int seat) {
		super();
		this.row = row;
		this.seat = seat;
	}
	public char getRow() {
		return row;
	}
	public void setRow(char row) {
		this.row = row;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
}
