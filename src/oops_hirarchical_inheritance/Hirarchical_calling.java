package oops_hirarchical_inheritance;

public class Hirarchical_calling {
	public static void main(String[] args) {
		System.out.println("...properties of son1...");
		Son1 s1=new Son1();
		    s1.car();
		    s1.home();
		    s1.money();
		    s1.bike();
		    
		    System.out.println("...properties of son2..");
		    Son2 s2=new Son2();
		        s2.car();
		        s2.home();
		        s2.money();
		        s2.mobile();
		        
		        System.out.println("...properties of son3");
		      Son3 s3=new Son3();
		           s3.car();
		           s3.home();
		           s3.money();
		           s3.laptop();
	}

}
