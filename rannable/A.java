package rannable;


public class A implements Runnable{
	String name;
	A(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.println(this.name);
		}
	}
	public static void main(String[] args) {
		
		A a1 = new A("xxx");
		Thread t1 = new Thread();
		t1.start();
		
		A a2 = new A("yyy");
		Thread t2 = new Thread();
		t2.start();
		
		for(int i = 0; i<10000; i++) {
			System.out.println("main");
		}
	}

}
