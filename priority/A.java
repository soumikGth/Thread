package priority;

public class A extends Thread {
	String name;
	A(String name){
		this.name = name;
		
	}
	public static void main(String[] args) {
		A a1 = new A("xxx");
		A a2 = new A("yyy");
		a2.setPriority(10); 
		a1.setPriority(9);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		
		a1.start();
		a2.start();
	}
	public void run() {
		System.out.println(this.name);
	}

}
