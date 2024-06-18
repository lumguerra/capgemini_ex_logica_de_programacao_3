package threads;

public class Printer implements Runnable{
	
	private String name = "";
	
	Printer(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 10; ++i) {
			System.out.println(name + ": " + i);
		}
		
		m2();
	}
	
	void m2() {
		System.out.println(" Method 2");
	}
	
}
