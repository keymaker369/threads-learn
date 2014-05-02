package niti.gomila_niti;

public class App {

	public static void main(String... args) {

		for (int i = 1; i <= 10; i++) {
			MyThread myThread = new MyThread("Moj tred " + i);
			myThread.setDaemon(true);
			myThread.start();
		}
		System.out.println("kraj");
	}
}
