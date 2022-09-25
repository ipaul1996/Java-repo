package First;

public class MyThread extends Thread {
	
	int num = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			System.out.println("Child Thread performing calculations");
			
			for(int i=0;i<=100;i++){
				num=num+i;
			}
			
			System.out.println("Child Thread giving the notification");
			this.notify();

			
		}
	}

}
