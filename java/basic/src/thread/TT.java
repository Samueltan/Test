package thread;

public class TT implements Runnable{
	int b = 100;
	public synchronized void m1() throws Exception{
		b = 1000;
		Thread.sleep(5000);
		System.out.println("b = " + b);
	}
	
	public synchronized void m2() throws Exception{
		Thread.sleep(2000);
		b = 2000;
	}
	
	public void run(){
		try{
			m1();
		}catch(Exception e){}
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		TT tt = new TT();
		Thread t = new Thread(tt);
		t.start();
		
		tt.m2();
		System.out.println(tt.b);
	}

}
