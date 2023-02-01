package singleTon_all_Thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
	public static void main(String[] args) {
		ExecutorService exService=null;
		MyThread mThread=new MyThread();
		try {
			exService=Executors.newFixedThreadPool(10);
			exService.execute(mThread);
			exService.execute(mThread);
			exService.execute(mThread);
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			if (exService!=null) {
				exService.shutdown();
			}
		}
	}
}
