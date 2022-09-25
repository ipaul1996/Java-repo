package First;

public class Demo1 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<30;i++){		
			System.out.println("inside run mehod "+i);
		}
		
		System.out.println("end of run() method");
	}
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		d1.start();
		
		for(int i=25;i<60;i++){
			System.out.println("inside main mehod"+i);
		}
		
		System.out.println("end of main()..");

	}

}
