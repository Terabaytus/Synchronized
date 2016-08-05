package Synchronized;

public class Main {

	private static int number;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(number);
	}

	public static synchronized void increceNumber(){//метод увеличевающий на еденицу переменную намбер
		number++;
	}
}
