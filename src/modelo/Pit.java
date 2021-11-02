package modelo;


import java.util.ArrayList;
import java.util.HashMap;

public class Pit {

	private ArrayList<Row> rows;
	char letter='a';
	
	public Pit() {
		super();
		this.rows = new ArrayList<>();
		rellenarRows();
	}
	
	public boolean isTaken(RequestSeat requestSeat) {
		int number = requestSeat.getSeat();
		char letter = requestSeat.getRow();
		Row row = getRow(letter); 
		if(row.getConcreteSeatTaken(number)) {
			return true;
		}
		return false;
	}
	
	public Row getRow(char secondLetter) {
		char lowerCase = Character.toLowerCase(secondLetter);
		int number=lowerCase-letter;
		return rows.get(number);
	}
	
	private void rellenarRows() {
		for (int i = 0; i < 15; i++) {
			Row row = new Row(); 
			this.rows.add(row);
		}
		
	}

	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}
	
	public Seat getSeatOnRow(char letterr, int number) {
		return this.getRow(letterr).getConcreteSeat(number);
	}
	
	public void setSeatOnRow(char letter,int number, boolean estado) {
		getSeatOnRow(letter, number).setTaken(estado);
	}

	@Override
	public String toString() {
		return "Pit [rows=" + rows + "]";
	}
	
	
	
	

}
