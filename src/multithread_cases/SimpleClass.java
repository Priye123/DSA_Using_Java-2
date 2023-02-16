package multithread_cases;

class CinemaHal {
	int totalSeats = 10;
	
	void bookSeat(int seats) { //6

		if (totalSeats >= seats) { //3>=6
			System.out.println(seats + " seats booked succesfully");
			totalSeats = totalSeats - seats; //10-7=3
			System.out.println("seats left::" + totalSeats);

		} else {
			System.out.println("Seats cannot be booked");
			System.out.println("seats left::" + totalSeats);//3
		}
	}
	
}

public class SimpleClass extends Thread {

	int seats;

	static CinemaHal c;
	
	@Override
	public void run() {
		c.bookSeat(this.seats);
	}

	// main is the parent thread of all the threads, so every thread will execute in main thread.
	public static void main(String[] args) {

		c = new CinemaHal();

		//50
		SimpleClass rahul = new SimpleClass();
		rahul.seats = 7;
		rahul.start();
		//c.bookSeat(rahul.seats);

		//70
		SimpleClass sameer = new SimpleClass();
		sameer.seats = 6;
		sameer.start();
		//c.bookSeat(sameer.seats);
		

	}

}
