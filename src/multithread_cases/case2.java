package multithread_cases;

public class case2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Yes");
	}

	public static void main(String[] args) {

		case2 c = new case2();
		Thread t = new Thread(c,"Raman");
		t.start();
	}

}
