package singleTon_all;

public class SingleTonTest {
		private static SingleTonTest instance=null;
		
		private SingleTonTest() {
			
		}
		private static  SingleTonTest getInstance() {
			if (instance==null) {
				instance=new SingleTonTest();
			}
			return instance;
		}
		public static void main(String[] args) {
			System.out.println(SingleTonTest.getInstance().hashCode());
			System.out.println(SingleTonTest.getInstance().hashCode());
		}
}
