package multithread_cases;

//1)performing single task from single thread
//public class YouTube extends Thread{
//	
//	@Override
//	public void run() {
//		System.out.println("Yes");
//	}
//
//	public static void main(String[] args) {
//		YouTube startVideo=new YouTube(); // thraed1
//		startVideo.start();
//
//	}
//
//}

//2)performing single task from multiple threads
//public class YouTube extends Thread {
//
//	// run the thread
//	@Override
//	public void run() {
//		System.out.println("Yes");
//	}
//
//	public static void main(String[] args) {
//
//		YouTube startVideo = new YouTube();// create a thread
//		startVideo.start();// start the thread
//
//		YouTube playMusic = new YouTube();
//		playMusic.start();
//
//		YouTube resize = new YouTube();
//		resize.start();
//	}
//}

class YouTube1 extends Thread {

	@Override
	public void run() {
		System.out.println("No");
	}
}

//4)performing multiple task from multiple threads
class YouTube extends Thread {

	// run the thread
	@Override
	public void run() {
		System.out.println("Yes");
	}

	public static void main(String[] args) {

		YouTube1 a = new YouTube1();
		a.start();
		
		YouTube b=new YouTube();
		b.start();
		
//		Thread t=new Thread("Raman");
//		System.out.println(t.getName());
	}
}