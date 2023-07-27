package types_of_variables;

public class Method1 {
	//local variable-temparary
	//scope within method
	//declare inside method/block/constructor
	//
	//global variable-permanant
	//scope throughout class
	//declare outside method/block/constructor
	
	//static global variable-
	//static global variable call from same class
	//static global variable call from different class
	
	int num1=5;
	
	public static void main(String[] args) {
		m1();
		Method1 g1=new Method1();
		g1.m2();
		
	}
	
	public static void m1() {
		int num=2;
		System.out.println(num);
		Method1 g2=new Method1();
		g2.m2();
	}
	
	public void m2() {
		System.out.println(num1); //call variablename
	}
	

}
