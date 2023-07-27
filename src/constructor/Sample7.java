package constructor;
//userdefined constructor with parameter
public class Sample7 {
	int num1;
	int num2;
	
	Sample7 (int a,int b){
		num1=a;
		num2=b;
		
	}
	public void add() {
		System.out.println(num1+num2);
		
	}
	public void multi() {
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		Sample7 s1=new Sample7(10,20);
		s1.add();
		s1.multi();
		
		
		Sample7 s2=new Sample7(2,4);
		s2.add();
		s2.multi();
	}
	

}
