package proj;

public class ThreadImpl {
	public static void main(String[] args) {
		A a=new A();
		Thread th=new Thread(a);
		th.start();
	}

}
