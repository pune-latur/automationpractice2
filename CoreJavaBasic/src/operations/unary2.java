package operations;

public class unary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=0,b;
   b=a++ + ++a + ++a + a;
   //b=0+2 +3+3
   System.out.println("a:"+a);//3
   System.out.println("b:"+b);//8
   System.out.println("***************");
  
   int p= 5,q;
   q=p++ + p++ + p--  +p;
   //q=5 +7+6+6
   System.out.println("p:"+p);//6
   System.out.println("q:"+q);//24

	}

}
