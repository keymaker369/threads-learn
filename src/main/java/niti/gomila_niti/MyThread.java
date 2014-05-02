package niti.gomila_niti;

import util.AlgorithmUtil;


public class MyThread extends Thread {

	public MyThread() {
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		while(true) {
			AlgorithmUtil.getFibonachyNumber(75);
		}
	}
}
