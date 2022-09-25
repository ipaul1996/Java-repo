package First;

public class Demo {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		Thread t1 = new Thread(a1);
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int result = a1.sum;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("inside main thread....");
			System.out.println(result);
		}
	}

}
