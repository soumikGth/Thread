package priority;

public class B extends Thread {
	String name;
	B(String name){
		this.name = name;
		
	}
	public static void main(String[] args) {
		B b1 = new B ("xxx");
		B b2 = new B ("yyy");
		b1.setName("addAmount");
		b2.setName("withdrawAmount");
		System.out.println(b1.getName());
		System.out.println(b2.getName());
		b1.start();
		b2.start();
		
	}
	public void run() {
		System.out.println(this.name);
	}

}
