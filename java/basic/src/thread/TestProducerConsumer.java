package thread;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}

}

class Bread{
	int id;
	Bread(int id){
		this.id = id;
	}
	
	public String toString(){
		return "Bread: " + id;
	}
}

class SyncStack{
	int index = 0;
	final int volumn = 6;
	Bread[] arrBread = new Bread[volumn];
	
	public synchronized void push(Bread bread){
		while(index == arrBread.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.notify();
		arrBread[index] = bread;
		index++;
	}
	
	public synchronized Bread pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.notify();
		index--;
		return arrBread[index];
	}
}

class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run(){
		for(int i=0; i<20; i++){
			Bread bread = new Bread(i);
			ss.push(bread);
			System.out.println("+++++: " + bread);
			try {
				Thread.sleep((int)(Math.random() * 10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run(){
		for(int i=0; i<20; i++){
			Bread bread = ss.pop();
			System.out.println("-----: " + bread);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		for(i==20)
	}
}