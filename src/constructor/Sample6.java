package constructor;
//user defined constructor without parameter
public class Sample6 {
	int num1;
	int num2;
	Sample6(){
		num1=20;
		num2=30;
		
	}
	
	public void add() {
		System.out.println(num1+num2);
		
	}
	public static void main(String[] args) {
		Sample6 s1=new Sample6();
		s1.add();
	}

}
