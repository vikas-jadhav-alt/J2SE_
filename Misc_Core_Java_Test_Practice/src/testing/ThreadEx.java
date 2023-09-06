package testing;

public class ThreadEx extends Thread {

	@Override
	public void run() {

		Thread ref = Thread.currentThread();

		System.out.println(ref.getName() + " A: outside interrupted ==>" + Thread.interrupted());// true -> false // 1
		System.out.println(ref.getName() + " A: outside isInterrupted ==>" + ref.isInterrupted()); // false
		
		
		System.out.println(ref.getName() + " A: 2nd outside interrupted ==>" + Thread.interrupted());// false -> true;
		System.out.println(ref.getName() + " A: 2nd outside isInterrupted ==>" + ref.isInterrupted()); // true
		

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000); // Already flag=false behaving like no interrupt occurred // 2
			} catch (InterruptedException e) {

				/** The moment interrupt handled, interrupt flag becomes false */
				System.out.println(ref.getName() + " B: inside isInterrupted ==>" + ref.isInterrupted());
				System.out.println("interrupt handled and returning...");
				return;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("starting main...");

		ThreadEx t = new ThreadEx();
		t.setName("Test");
		t.start();

		t.interrupt();

		System.out.println("main: I am done.");
	}

}