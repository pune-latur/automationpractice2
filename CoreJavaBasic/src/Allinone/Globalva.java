package Allinone;

public class Globalva {
 static int rollno=565;
 static boolean result=true ;
  static double payment =4500.66;
 char grade;
  double payment2=65775;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("payment :"+payment);// Static
	    System.out.println("rollno:"+rollno);   
	    System.out.println("result :"+result);

	    Globalva G3=new Globalva();
	    System.out.println("grade:"+G3.grade); //non S
	    System.out.println("payment2:"+ G3.payment2);//non S

	}

}
