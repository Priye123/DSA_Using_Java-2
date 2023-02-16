package multithread_cases;

//Google Interview questions
public class Sleep extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "-->" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Sleep s = new Sleep();
		s.run();

		Sleep s1 = new Sleep();
		s1.start();

		Sleep s2 = new Sleep();
		s2.start();

	}
}

//for (int i = 0; i < 5; i++) {
//System.out.println(i);
//Thread.sleep(5000);
//}

//System.out.println("Rahul");
//Thread.sleep(15000);
//System.out.println("Priye");
//Thread.sleep(14000);
//System.out.println("Sammer");
//Thread.sleep(12000);
//System.out.println("Mohan");
