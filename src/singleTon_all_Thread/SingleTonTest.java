package singleTon_all_Thread;

public class SingleTonTest {
	private static SingleTonTest instance=null;
	private SingleTonTest() {
		
	}
	
	static synchronized SingleTonTest getInstance() {
		if (instance==null) {
			synchronized (SingleTonTest.class) {
				if (instance==null) {
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					return instance=new SingleTonTest();
				}
			}
		}
		
		return instance;
		
	}
}
