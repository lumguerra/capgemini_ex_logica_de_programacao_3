package threads;

public class ThreadsTest {
	
	public static void main(String[] args) {
		
		Printer p1 = new Printer("p1");		
		Printer p2 = new Printer("p2");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();

	}

}
