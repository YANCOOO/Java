package duoxiancheng;

public class DuoXianCdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new runableImp();

		Thread r1 = new Thread(r);
		Thread r2 = new Thread(r);
		Thread r3 = new Thread(r);
		
			r1.start();
			r2.start();
			r3.start();

	}

}
