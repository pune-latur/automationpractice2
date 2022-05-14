package Array;

public class Marray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyfrom= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		
  char[]copyto=new char[7];
  //copying array using 
  //System.arraycopy() method
 System.arraycopy(copyfrom, 2, copyto, 0, copyto.length);
  for (int i=0;i<copyto.length;i++) {
	  System.out.println(copyto[i]);
  }
	}
  }