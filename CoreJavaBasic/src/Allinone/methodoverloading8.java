package Allinone;

public class methodoverloading8 {
      public void disp(char c) {
	 System.out.println(c);
 }
 public void disp(char c,int num) {
	 System.out.println(c+""+num);
	 }
 
 public void callme() {
	 System.out.println("i am callme of methodoverloading8 class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       methodoverloading obj=new methodoverloading();
       obj.disp('c');
       obj.disp('c',10);
       obj.callme();
       methodoverloading8 obj2= new methodoverloading8();
       obj2.callme();
	}

}
