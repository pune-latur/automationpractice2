package Allinone;

public class methodoverloding2 {
            static double res;
            static public void square() {
            	System.out.println("no parametr method calles");
            }
            static public void square(int num) {
            	res=num*num;
            	
            	System.out.println("int parametr method calles:"+res);
            }
            static public void square(double num) {
                res=num*num;
            	System.out.println("double parameter method calles:"+res);

            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 System.out.println("result:"+res);//
                 methodoverloading.square(2.5f);
                 System.out.println("result:"+res);//
                 methodoverloading.square();
                 methodoverloading.square(5);
                 System.out.println("result:"+res);  //

	}

}
