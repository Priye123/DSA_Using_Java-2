package multithread_cases;

public class MediaPlayer extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) { // main() is also a thread

		MediaPlayer resize = new MediaPlayer();//Thread-0
		resize.start();
		
		MediaPlayer startMusic = new MediaPlayer();//Thread-1
		startMusic.start();
		
		MediaPlayer playVideo = new MediaPlayer();//Thread-2
		playVideo.start();
		
	}

}

// currentThread() stores the address of thread(reference variable)

//Thread address=Thread.currentThread();
//System.out.println(address);

//String nameofCurrentThread = Thread.currentThread().getName();
//System.out.println(nameofCurrentThread);
//
//Thread.currentThread().setName("Rahul"); // thread name main se Rahul ban gya
//System.out.println(Thread.currentThread().getName());
