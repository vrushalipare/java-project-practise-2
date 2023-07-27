package constructor;

public class Sample5 {
	int num1;
	int num2;
	
	Sample5(int a,int b){
		num1=a;
		num2=b;
		
		
	}
	public void multi() {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Sample5 g2=new Sample5(5,7);
		g2.multi();
	}

}
