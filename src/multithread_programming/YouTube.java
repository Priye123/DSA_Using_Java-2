package multithread_programming;

//thread creation by using Thread class
//performing single task from single thread
public class YouTube extends Thread {

	// Task
	@Override
	public void run() {
		System.out.println("Thread tasks");
	}

	public static void main(String[] args) {

		// thread
		YouTube yt = new YouTube();
		
		// yt.run();

		yt.start();

	}

}
