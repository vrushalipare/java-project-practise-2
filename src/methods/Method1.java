package methods;

public class Method1 {
	public static void main(String[] args) {
		m1();
		
		Method1 g1=new Method1();
		g1.m2();
		
		System.out.println("---------------");
		
		Method1_A.m3(); //static regular method call from different class
		Method1_A g2=new Method1_A();
		g2.m4(); //non static regular method call from different class.
		
	}
	public static void m1() {
		System.out.println("static regular method call from same class.");
		
		
	}
	public void m2() {
		System.out.println("non static regular method call from same class.");
	}

}
