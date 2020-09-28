import org.testng.annotations.Test;

public class ThreadDemo {
	 @Test(threadPoolSize = 4, invocationCount = 6, timeOut = 1000)
	    public void testMethod() 
	    {
	        System.out.println("Thread ID Is : " + Thread.currentThread().getId());
	    }
}
