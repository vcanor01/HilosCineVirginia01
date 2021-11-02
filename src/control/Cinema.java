package control;

import modelo.Pit;
import modelo.RequestSeat;

public class Cinema {
	Pit pit=new Pit();
	public Cinema() {
		super();
		this.pit = new Pit();
	}

	public synchronized boolean requestSeat(RequestSeat requestSeat) {
		if(pit.isTaken(requestSeat)) {
			return false;
		}
		int number = requestSeat.getSeat();
		char letter = requestSeat.getRow();
		pit.setSeatOnRow(letter, number, true);
		return true;
	}

}
