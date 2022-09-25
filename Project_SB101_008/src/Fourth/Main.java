package Fourth;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		Thread t1 = new Thread(ta);
		Thread t2 = new Thread(tb);
		
		t1.start();
		t2.start();
	}

}
