package Allinone;

public class combine1 {
    int age=55;         //nonsgv
    
   static double salary=555500.9;//sgvariable 
   
   static void student()          {//s method
   }
   public  double dispaly1(int no1,int no2, int res) {//nons m
   System.out.println("res:"+(no1+no2));
   return res=no1+no2;
   }
   public void disp(char c)          {//M overload
   System.out.println(c);
   }
   public void disp(int no,char d) {
       System.out.println(d+""+no);
   }
   
	public static void main(String[] args, char c, char d) {
		combine1 S1=new combine1();
        System.out.println("age:"+ S1.age);
     
        System.out.println("salary:"+combine1.salary);
         
        combine1 D1=new combine1();
        System.out.println("salary:"+D1.salary);
        D1.display1();
        
        
        combine1 A1=new combine1();
        A1.disp(c);
        A1.disp(10,d);
	
         combine1.student();  }   //static M
           private void display1() {
		// TODO Auto-generated method stub
		
	}

}
