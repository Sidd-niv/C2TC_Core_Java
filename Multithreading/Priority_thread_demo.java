package Multi_THreading;


class Demo implements Runnable{
	
	public void run() {
		for(int i=0; i<=4; i++) {
			System.out.println("Thread1 opreation: "+i);
			if(i == 4) {
				System.out.println("As we set priority high of demo class thread it will excute first ");
			}
		}
	}
}
class Demo2 implements Runnable{
	
	public void run() {
		for(int i=0; i<=4; i++) {
			System.out.println("Thread2 opreation: "+i);
		}
	}
}


public class Priority_thread_demo {

	public static void main(String[] args) {
//		 By default main Thread priority is 5
		System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
		Thread obj2 = new Thread(new Demo());
		Thread obj3 = new Thread(new Demo2());
		
//		setting Demo class thread to 1 by .setPriority()
		obj2.setPriority(1);
		obj2.start();
		obj3.start();

		
		
		
		

	}

}
