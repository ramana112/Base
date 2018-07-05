
public class MyThread extends Thread{
	
	@Override
	public void run() {
	System.out.println("i am in run");
	System.out.println(Thread.currentThread().getName());
	}

}
