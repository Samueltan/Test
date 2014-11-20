package thread;

public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync test = new TestSync();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

	public void run(){
		timer.add(Thread.currentThread().getName());
	}
}

class Timer{
	private static int num = 0;
	public synchronized void add(String name){
//		synchronized(this){
			num++;
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println(name + ", you are the No# " + num + " thread that uses the timer.");
//		}
	}
}