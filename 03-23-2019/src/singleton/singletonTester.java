package singleton;

public class singletonTester {
	
	public static void main(String[] args) {
	
	singletonExample instance1 = singletonExample.getInstance();
	singletonExample instance2 = singletonExample.getInstance();
	
	System.out.println("Instance 1 hash: " + instance1.hashCode());
	System.out.println("Instance 2 hash: " + instance2.hashCode());

	}	

}
