package Second;

public class Main {

	public static void main(String[] args) {
		
		Common c = new Common();
		
		ThreadA ta = new ThreadA(c, "Ram");
		ThreadB tb = new ThreadB(c, "Shyam");
		
//		Common c1 = new Common();
//		Common c2 = new Common();
//		
//		ThreadA ta = new ThreadA(c1, "Ram");
//		ThreadB tb = new ThreadB(c2, "Shyam");
//		Here, again the data inconsistency may occur.
		
		ta.start();
		tb.start();
		
	}
}
