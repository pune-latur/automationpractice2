package day14conditions;

public class IFCondition8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age =17;
      int weight=51;
      if (age>= 18) {
   	   System.out.println("Candidate age is:" +age);
   	   if (weight > 50)  {
   		  System.out.println("you are eligiable to donate blood");
   	   }else {
   		   System.out.println("you are not eligiable to donate blood");
   	   }
      }else  {
   	   	   System.out.println("Age must be greater than 18");
   	   	   
   	   }
	}
}
