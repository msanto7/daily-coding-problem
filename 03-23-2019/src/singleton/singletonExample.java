package singleton;

public class singletonExample {
	
	//private static singletonExample firstInstance = null;
	//private static singletonExample secondInstance = null;
	
	private static singletonExample[] instances;
	
	private singletonExample() { }
	
	public static void initNumInstances(int num) {
		instances = new singletonExample[2];
	}
	
	public static singletonExample getInstance(int index) {
		if (instances == null) {
			System.out.println("pass num instances");
		}
		if (instances[index] == null) {
			instances[index] = new singletonExample();
		}
		return instances[index];
	}
	
	/* public static singletonExample getInstance() {
		
		// lazy init -- only created if necessary
		if (firstInstance == null && secondInstance == null) {
			
			firstInstance = new singletonExample();
			secondInstance = new singletonExample();
			
		}
		
		return firstInstance;
	}
	*/
}
