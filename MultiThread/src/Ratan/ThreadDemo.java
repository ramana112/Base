package Ratan;

class MyThread extends Thread
{
	/*@Override
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("user defined Thread");
	}}
*/}

public class ThreadDemo extends MyThread {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start(); //t.run(); "t.start() creates thread for MyThread & t.run() doesnot"
		//logics of main method
		for(int i=0;i<3;i++)
		{
			System.out.println("main method");
		}*/
		ThreadDemo t = new ThreadDemo();
		t.start();
	}
	
	public void start()
	{
		System.out.println("start in main method");
	}
}
