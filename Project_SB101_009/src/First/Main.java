package First;

public class Main implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0;  i < 10; i++) {
			System.out.println("Inside run " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End of run()...");
		
	}
	
	
	public static void main(String[] args) {
		
		Main m1 = new Main();
		Thread t1 = new Thread(m1);
		
		t1.start();
		
		System.out.println("End of Main()...");
	}

}
