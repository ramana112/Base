package Ratan;

 class ThreadPrior extends Thread {
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}

 public class ThreadDemoPrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPrior t1 =new ThreadPrior();
		t1.setPriority(10);
		ThreadPrior t2 =new ThreadPrior();
		t2.setPriority(1);
		t2.start();
		t1.start();
	}

}
