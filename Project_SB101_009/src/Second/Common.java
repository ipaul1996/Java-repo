package Second;

public class Common {
	
	public synchronized void fun1(String name) {
		
		System.out.println("Welcome");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
	}

}
