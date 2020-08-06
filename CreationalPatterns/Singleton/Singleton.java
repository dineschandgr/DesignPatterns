
public class Singleton {
	
	final static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getStudent(){
		return singleton;
	}
	
	public void displayMessage(){
		System.out.println("Hello World!");
	}
	
}
