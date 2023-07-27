package constructor;

public class Sample4 {
	
	//user defined constructor with parameter
	int num1;
	int num2;
	
	Sample4(int a,int b){
		num1=a;
		num2=b;
		
	}
	public void add() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		Sample4 g1=new Sample4(5,6);
		g1.add();
	}

}
