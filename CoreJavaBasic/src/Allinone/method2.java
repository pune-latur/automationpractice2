package Allinone;

public class method2 {
	static double res;
    static  public void student() {
    	System.out.println("no parameter");
    	
    }
    static  public void student(int no){
    	res=no*no;
    	System.out.println("int parameter");
         
    }
    static public void student(double no) {
    	res=no*no;
    	System.out.println("double parameter");

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println(" result:"+res);
        method2.student(2.5f);
    	System.out.println("result:"+res);
        method2.student();
        method2.student(5);
    	System.out.println("result:"+res);
	}

}
