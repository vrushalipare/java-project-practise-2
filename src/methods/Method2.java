package methods;

public class Method2 {
	public static void main(String[] args) { //methods passing parameters
	m1(20,20);
	
	Method2 g1=new Method2();
	g1.m2("Vrushali","Pare");
		
	}
	public static void m1(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	
	public void m2(String fname,String lname) {
		System.out.println(fname+" "+lname);
		
	}

}
