package Allinone;

public class Gvariablenon {
 int empid=453;//non s gv 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("program starts");
	    Gvariablenon N1=new Gvariablenon();
	    System.out.println("empid:"+N1.empid);
  N1.empid=445;      //updating non s gv value
  System.out.println("updated non static g variable empid:"+ N1.empid);

	}

}
