package singleton;

public class singletonTester {
	
	public static void main(String[] args) {
	
	//singletonExample instance1 = singletonExample.getInstance();
	//singletonExample instance2 = singletonExample.getInstance();
	
	singletonExample[] instances = singletonExample.getInstance(2);
	
	System.out.println("Instance 1 hash: " + instances[0].hashCode());
	System.out.println("Instance 2 hash: " + instances[1].hashCode());

	}	

}
