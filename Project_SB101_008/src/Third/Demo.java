package Third;

public class Demo {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		
		Thread t = new Thread(ta);
		
		t.start();
		
		for(int i=20;i<40;i++){
			System.out.println("inside main of ThreadA:"+i);
		}

	}

}
