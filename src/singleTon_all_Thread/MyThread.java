package singleTon_all_Thread;

public class MyThread extends Thread {
	
	
	@Override
	public void run() {
		SingleTonTest instance = SingleTonTest.getInstance();
		System.out.println(Thread.currentThread().getName()+"::"+instance);
		System.out.println(Thread.currentThread().getName()+"::"+instance);
	}
}
