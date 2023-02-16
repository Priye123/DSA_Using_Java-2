package multithread_programming;

//task creation using Runnable interface

public class VLC implements Runnable {

	public void run() {
		System.out.println("Thread tasks");
	}

	public static void main(String[] args) {
		VLC v = new VLC();
		Thread th = new Thread(v);// extra setp bcoz start() method is not present in runnable interface

		th.start();
	}

}
