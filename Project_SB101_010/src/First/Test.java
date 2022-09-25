package First;

public class Test {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		synchronized (mt) {
			System.out.println("Main thread calls the wait method");
			try {
				mt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main thread got the notification");
			System.out.println(mt.num);
		}
	}

}
