class Demo_sync{
	
	public synchronized void met(String str) {
			for(int i=0; i<=2; i++) {
				if(i==0)System.out.println(str+ " is running task: ");
				System.out.println(str+ " opeartion:"+i);
				try
		        {
		            Thread.sleep(1000);
		        }
		        catch (Exception e)
		        {
		            System.out.println("Thread  interrupted.");
		        }
			}
		
	}
}

class Demo_thread implements Runnable{
    String name;
    Demo_sync obj;
    
    Demo_thread(String name, Demo_sync obj){
    	this.name = name;
    	this.obj = obj;
    }
    
 
	public void run() {
	        obj.met(name);

	}
	
}


public class Synchronized_demo {

	public static void main(String[] args) {
		Demo_sync obj = new Demo_sync();
		Thread obj1 = new Thread(new Demo_thread("Thread 1", obj));
		Thread obj2 = new Thread(new Demo_thread("Thread 2", obj));
		
		obj1.start();
		obj2.start();
		
	

	}

}
