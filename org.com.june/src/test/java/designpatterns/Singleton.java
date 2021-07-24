package designpatterns;

public class Singleton {
	
	int var = 5;
	static int counter = 0;
	
	private static Singleton obj ;
	
	
	void test() {
		System.out.println("run");
	}
	
	private Singleton() {
		counter++;
	}
	
	public static Singleton getInstance() {
		
		
		if(counter<1) {
			obj = new Singleton();
			counter++;
		}
		
		return obj;
			

	}

}
