package multithread_cases;

class CinemaHall {
	int totalSeats = 10;

	synchronized void bookSeat(int seats) {

		if (totalSeats >= seats) { 
			System.out.println(Thread.currentThread().getName() + " seats booked succesfully");
			totalSeats = totalSeats - seats;
			System.out.println(Thread.currentThread().getName() + " seats left::" + totalSeats);

		} else {
			System.out.println(Thread.currentThread().getName() + " Seats cannot be booked");
			System.out.println(Thread.currentThread().getName() + " seats left::" + totalSeats);
		}
	}

}

public class MovieBookApplication extends Thread {

	int seats;

	static CinemaHall c;

	@Override
	public void run() {

		c.bookSeat(this.seats);
	}

	public static void main(String[] args) {

		c = new CinemaHall();

		MovieBookApplication rahul = new MovieBookApplication();
		rahul.setName("Rahul");
		rahul.seats = 7;
		rahul.start();

		MovieBookApplication sameer = new MovieBookApplication();
		sameer.setName("Sameer");
		sameer.seats = 6;
		sameer.start();

	}

}
