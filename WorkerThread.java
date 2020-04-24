package proj;

public class WorkerThread implements Runnable{

	String message;
	WorkerThread(String message){
		this.message=message;
	}
	public void run() {
		System.out.println("WorkerThread");
		System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
		processmessage();
		 System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	}
	  private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  
}
