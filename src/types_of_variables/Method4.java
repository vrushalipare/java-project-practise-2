package types_of_variables;

public class Method4 {
	static int a=3;
	public static void main(String[]args) {
		System.out.println(a);
		m1();
		Method4 g1=new Method4();
		g1.m2();
		
	}
	public static void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(a);
	}

}
