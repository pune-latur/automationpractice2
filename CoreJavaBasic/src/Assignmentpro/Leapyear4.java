package Assignmentpro;

public class Leapyear4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  year=  2024 ;
      if  (((year % 4==0)  && (year % 100 == 0))  || ( year % 400 == 0)) {
      System.out.println("leap year");
	} else {
		   System.out.println(" common year");
	}
      
	}

}
