package gomila_niti;

public class App {

	public static void main(String... args) {

		for (int i = 1; i <= 50; i++) {
			MyThread myThread = new MyThread("Moj tred " + i);
			myThread.start();
		}
		System.out.println("kraj");
	}
}
