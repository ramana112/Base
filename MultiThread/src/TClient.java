
public class TClient {

	public static void main(String[] args) {

		/*System.out.println("i am in main");
		Thread t = Thread.currentThread();
		System.out.println(Thread.currentThread());*/
		
		MyThread obj = new MyThread();
		MyThread obj1 = new MyThread();
		/*obj.setPriority(6);
		obj1.setPriority(Thread.NORM_PRIORITY);
		obj.setName("MyThread High");
		obj1.setName("MyThread low");
		obj.start();
		obj.run();
		obj1.start();
		MyThreadRun t1 = new MyThreadRun();
		t1.run();
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t1);
		t3.start();
		t4.start();*/
		obj.run();
		obj.start();
	}

}
