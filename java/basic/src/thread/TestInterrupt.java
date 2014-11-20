package thread;

import java.util.Date;

public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
		try{
			Thread.sleep(3000);
//			throw new InterruptedException();
		}catch(InterruptedException e){
		}
		thread.interrupt();
	}

}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println(new Date());
			try{
				sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Exit!");
				return;
			}
		}
	}
}