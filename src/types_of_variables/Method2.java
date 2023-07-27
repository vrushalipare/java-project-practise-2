package types_of_variables;

public class Method2 {
	
	 static int b=6;//global
	public static void m1() {
		int a=5;//local
		
		
	System.out.println(b);
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println(b);
		
	}
	
	

}
