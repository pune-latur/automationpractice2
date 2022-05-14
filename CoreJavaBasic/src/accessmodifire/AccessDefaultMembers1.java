package accessmodifire;

public class AccessDefaultMembers1 {

	private static  char[] accNum = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AccessDefaultMembers1 p1=new AccessDefaultMembers1();
 System.out.println("accessing default members from another class within same package ");
 System.out.println(p1.accNum);
 p1.displayAccNum();
	}

	private void displayAccNum() {
		// TODO Auto-generated method stub
		
	}

}
