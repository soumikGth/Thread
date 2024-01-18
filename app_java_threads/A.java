package app_java_threads;

public class A extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			System.out.println("Run");
		}
	}
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.start();
		for(int i = 0; i<1000; i++) {
			System.out.println("Main");
			
		}
		/*A a1 = new A();
		a1.start();*/
	}

}
