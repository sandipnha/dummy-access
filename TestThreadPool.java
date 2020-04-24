package proj;

import java.util.concurrent.*;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		
		for (int i = 0; i < 10; i++) 
		{
				Runnable worker = new WorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
		}
	}
}
