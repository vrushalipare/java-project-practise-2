package constructor;

public class Sample3 {
	//user defined constructor
	
	int num1;
	int num2;
	
	Sample3(){
		num1=2;
		num2=3;
	}
	
	public void m1() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		Sample3 g1=new Sample3();
		g1.m1();
	}

}
