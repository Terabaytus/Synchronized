package Synchronized;

public class Worker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i=0;i<2000;i++){
			Main.increceNumber();
		}
	}

}
