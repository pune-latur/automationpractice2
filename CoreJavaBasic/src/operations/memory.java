package operations;

public class memory {
           static int salary ;
           int empid;
           void display() {
        	   System.out.println("i am display()...");

           }
           static void println() {
        	   System.out.println("i am print()...");
        	   	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static variable salary:"+memory.salary);//access static member
		memory.println();
		
		memory obj=new memory();
		System.out.println("empid:"+ obj.empid);//  access non static member
		obj.display();
	
		memory.salary=67777;  //update static member
		System.out.println("salary:"+memory.salary);
 
		obj.empid=555;  ///update non static member
		System.out.println("empid:"+obj.empid);



	}

}
