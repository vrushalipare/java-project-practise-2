package constructor;

public class Sample1 {
	//default constructor
	public void m1() {
		System.out.println("default constructor call from same class");
	}
	
	public static void main(String[] args) {
		Sample1 g1=new Sample1();
		g1.m1();
		
		Sample2 g2=new Sample2();
		g2.m3();
	}

}
