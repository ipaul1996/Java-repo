package Third;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		
		for(int i=20;i<40;i++){
			System.out.println("inside run() of ThreadA"+i);
		}
		
	}

}
