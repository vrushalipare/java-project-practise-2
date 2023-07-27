package polymorphism;

public class SubClass extends SuperClass{
	
	public void bike() {
		System.out.println("bike:Harly Devidson");
	}
	
	public void home() {
		System.out.println("home:3BHK");
	}
	
	public static void main(String[] args) {
		SubClass s1=new SubClass();
		s1.bike();
		s1.home();
	}

}
