package control;
import java.util.Random;

import modelo.GeneradorRequestRandom;
import modelo.RequestSeat;


public class User extends Thread {
	GeneradorRequestRandom generadorRequestRandom = new GeneradorRequestRandom();
	Cinema cinema;
	int id;
	
	
	public User(Cinema cinema, int id) {
		super();
		this.cinema = cinema;
		this.id = id;
	}

	@Override
	public void run() {
		super.run();
		
		RequestSeat requestSeat; 
		int contador=0;
		do {
			this.generadorRequestRandom = new GeneradorRequestRandom();
			requestSeat = new RequestSeat(this.generadorRequestRandom.getLetter(),this.generadorRequestRandom.getNumber());
			contador++;
			
		}while(!cinema.requestSeat(requestSeat));
		System.out.println("Soy el cliente numero : "+this.id +" y mi asiento es el: "+ requestSeat.getRow()+ requestSeat.getSeat()+ " lo he intentado : "+ contador+ " veces");
		
		
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
