package this_super_keyword;

public class Demo1 extends Demo2{ //sub class
	int a=20;
	public void m1() {
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Demo1 g1=new Demo1();
		     g1.m1();
	}

}
