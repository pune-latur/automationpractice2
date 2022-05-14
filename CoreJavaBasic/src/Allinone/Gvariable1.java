package Allinone;

public class Gvariable1 {
 int  empid=232;//non static gv
 static double salary =22338;  //static gv
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=45;
System.out.println("age:"+age);
System.out.println("salary:"+salary);
System.out.println("salary :"+Gvariable1.salary);
 Gvariable1 G1=new Gvariable1() ;
 System.out.println("empid:"+G1.empid);

	}

}
