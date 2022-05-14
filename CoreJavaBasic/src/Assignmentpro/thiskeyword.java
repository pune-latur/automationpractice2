package Assignmentpro;

public class thiskeyword {
        int age;
        void call () {
          	 System.out.println("i am call method") ;

        }
        void m(int age) {
          	 System.out.println("local age :" +age) ;
           	 System.out.println("global age :" +this.age) ;
  //call()
 this.call();
	 System.out.println("this keyword value is:"+ this) ;

        }
	public static void main(String[] args) {
		thiskeyword obj =new thiskeyword();
		// TODO Auto-generated method stub
   	 System.out.println("object obj value is:" +obj) ;
   	 obj .m(25);
   	 
         
	}

}
