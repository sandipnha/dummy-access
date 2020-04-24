package proj;

public class RunnableDemo implements Runnable {

	 private Thread t;
	 private String threadName;
	   
	public RunnableDemo(String name) 
	{
		threadName=name;
	      System.out.println("Creating " +  threadName );
	}
	 
	public void run() 
	{
		System.out.println("Running--->"+threadName);		
	}

}
