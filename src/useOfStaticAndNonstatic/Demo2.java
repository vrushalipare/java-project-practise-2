package useOfStaticAndNonstatic;

public class Demo2 {
	public static void main(String[] args) {
		
	
Demo1 s1=new Demo1();
s1.sName="Amol";
s1.sRollno=101;
Demo1.pName="Adit";

Demo1 s2=new Demo1();
s2.sName="Aush";
s2.sRollno=102;
Demo1.pName="Adit";

Demo1 s3=new Demo1();
s3.sName="Aayushi";
s3.sRollno=103;
Demo1.pName="Maya";


s1.stuInfo();
s2.stuInfo();
s3.stuInfo();
}
}