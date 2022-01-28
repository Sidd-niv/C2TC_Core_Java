// In this code we will see how to use ReentrantLock in java.
package Multi_THreading;


import java.util.concurrent.locks. ReentrantLock;

public class Reenterantlock_demo {

	public static void main(String[] args) {
		// ReentrantLock object  
		ReentrantLock lock_obj = new ReentrantLock();
	
		System.out.println("This method will return the count of threads in the quene: "+lock_obj.getQueueLength());
		System.out.println("This method will whether the thread is holding a lock or not: "+lock_obj.isHeldByCurrentThread());
		
		// Holding lock with lock method.
		lock_obj.lock();
		lock_obj.lock();
		System.out.println("This method will return the count of lock: "+lock_obj.getHoldCount());
		System.out.println("This method will whether the thread is holding a lock or not: "+lock_obj.isHeldByCurrentThread());
		
		// isLocked method will return boolean on thread is lock or not
		System.out.println(lock_obj .isLocked());
		
		//This .unlock() will remove the lock which is lock by thread.
		lock_obj.unlock();
		System.out.println(lock_obj.getHoldCount());

	}

}
