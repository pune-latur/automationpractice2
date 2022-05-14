package day1variables;
       
public class Globalvariable1 {
	static int rollno=55;
    static double salary=677565.8;
    
    double payment =623626;
    boolean result ;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no1 =44 ; int no2=38,res;
        res=no1*no2;
        System.out.println("program starts") ;
        
        System.out.println("first no1:"+no1);
        System.out.println("second no2:"+no2);
        System.out.println("res:"+res);
      
        System.out.println("rollno:"+rollno);
        System.out.println("salary:"+salary);
        
        
         Globalvariable1 D1=new Globalvariable1();
         System.out.println("payment:"+D1.payment);
         System.out.println("result :"+D1.result);
                                 //update the s&nons g variable
        int rollno=500;
        double salary=56546;
        
    D1.payment=5577;
    D1.result=true;
    
    System.out.println("rollno:"+rollno);
    System.out.println("salary:"+salary);
    
    
    System.out.println("payment:"+D1.payment);
    System.out.println("result:"+D1.result);
    System.out.println("program starts");         

	}
}