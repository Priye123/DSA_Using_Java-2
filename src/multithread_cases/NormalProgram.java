package multithread_cases;

public class NormalProgram extends Thread {

	// thread create krke wo task exexuite krega
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {

		NormalProgram n = new NormalProgram();
		n.start(); // start function likhne se thread power me aa jayega

		// n.run();
//		Thread.sleep(5000);
//		System.out.println("Mohan");
	}

}
