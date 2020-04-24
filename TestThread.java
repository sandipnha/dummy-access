package proj;

public class TestThread {
	public static void main(String[] args) {
		Multi multi=new Multi();
		Thread thread=new Thread(multi);
		thread.start();
	}

}
