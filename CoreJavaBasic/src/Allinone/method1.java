package Allinone;


public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Get interest using getinterest ():"+method1.getinterrest(25000,4.5,3));
       System.out.println("get interest using getinterrest1():"+method1.getinterrest1(25000,4.5,3));
       
       method1.getinterrest(350000,5,35);
       System.out.println("*******************");
       double res=method1.getinterrest(25000,4.5,3);
       System.out.println(res); 
       }
	public static double getinterrest (int p,double r,int t) {
		return(p*r*t)/100;
	}
	
	System.out.println("interest is :"+res);
	
	}

}
