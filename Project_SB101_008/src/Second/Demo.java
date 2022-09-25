package Second;

public class Demo {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadC tc = new ThreadC();
		
		ta.start();
		tb.start();
		tc.start();
		
		for (int i = 70; i < 80; i++) {
			System.out.println("inside main of Test:" + i);
		}
		
		System.out.println("end of main");

	}

}
