package methods;

public class Method3 {
	public static void main(String[] args) {
		m1();
		Method3 g1=new Method3();
		g1.m2();
		
		Method3_A.m3();
		
		Method3_A g2=new Method3_A();
		g2.m4();
		
		
	}
	public static void  m1() {
		System.out.println("regular static method call from same class.");
	}
	
	public void m2() {
		System.out.println("regular non static method call from same class.");
	}

}
