package control;

public class Principal {

	public static void main(String[] args) {
			
			Cinema cinema = new Cinema();
			for (int i = 1; i <= 500; i++) {
				User user = new User(cinema, i);
				user.start();
				
				
			}
			
	}

}
