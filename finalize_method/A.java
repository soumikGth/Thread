package finalize_method;

public class A extends Object {
	
	protected void finalize() {
		System.out.println(1000);
		
		
	}
	public static void main(String[] args) {
		A a1 = new A();
		//a1 = null;
		System.gc();
	}

}
