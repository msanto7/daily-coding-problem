package singleton;

public class singletonExample {
	
	private static singletonExample firstInstance = null;
	private static singletonExample secondInstance = null;
	
	private singletonExample() { }
	
	public static singletonExample getInstance() {
		
		// lazy init -- only created if necessary
		if (firstInstance == null && secondInstance == null) {
			
			firstInstance = new singletonExample();
			secondInstance = new singletonExample();
			
		}
		
		return firstInstance;
	}
}
