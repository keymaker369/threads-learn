package niti.niti_spavaju;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class MyThread extends Thread {

	public MyThread() {
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		int min = 0;
		int max = 10;
		int secondsWait = (new Random().nextInt((max - min) + 1) + min) * 1000;

		System.out.println("Start: " + new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSSXXX").format(new Date(System.currentTimeMillis())) + this.getName() + " wait: " + secondsWait);

		try {
			sleep(secondsWait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End: " + new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSSXXX").format(new Date(System.currentTimeMillis())) + this.getName() + " wait: " + secondsWait);
	}
}
