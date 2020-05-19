package duoxiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class runableImp implements Runnable {

	private int piao = 500;
	Lock l = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {

			l.lock();

			if (piao > 0) {
				try {
					Thread.sleep(1);
					System.out.println(Thread.currentThread().getName() + " " + piao);
					piao--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			l.unlock();

		}

	}

//	public synchronized void name() {
//		while (true) {
//			if (piao > 0) {
//				try {
//					Thread.sleep(1);
//					System.out.println(Thread.currentThread().getName() + " " + piao);
//					piao--;
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//
//		}
//
//	}

}
