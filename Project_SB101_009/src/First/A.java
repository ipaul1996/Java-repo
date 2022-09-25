package First;

public class A implements Runnable{
	
	int sum;

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("inside A thread");
			sum = sum + i;
		}
		
	}

}
