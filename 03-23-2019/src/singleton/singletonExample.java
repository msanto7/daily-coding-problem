package singleton;

public class singletonExample {
	
	private static singletonExample firstInstance = null;
	
	private singletonExample() { }
	
	public static singletonExample getInstance() {
		
		// lazy init -- only created if necessary
		if (firstInstance == null) {
			
			firstInstance = new singletonExample();
			
		}
		
		return firstInstance;
	}
}
