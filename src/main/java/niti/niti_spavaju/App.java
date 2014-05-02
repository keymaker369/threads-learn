package niti.niti_spavaju;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



public class App {

	public static void main(String... args) {

		ExecutorService executorService =
				  new ThreadPoolExecutor(
				    15, // core thread pool size
				    20, // maximum thread pool size
				    1, // time to wait before resizing pool
				    TimeUnit.SECONDS,
				    new ArrayBlockingQueue<Runnable>(20, true),
				    new ThreadPoolExecutor.CallerRunsPolicy());


		for (int i = 1; i < 12; i++) {
			MyThread myThread = new MyThread("Moj tred " + i);
//			myThread.setDaemon(true);
			myThread.start();
//			executorService.execute(myThread);
		}
		System.out.println("kraj");
	}
}
