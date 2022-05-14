package operations;

public class logicaloperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 44;
		char blgrop = 'A';
		boolean res1, res2;
		res1 = (age > 18);
		res2 = (blgrop == 'A');
		System.out.println("result1:" + res1);
		System.out.println("result2:" + res2);

	          	// logical and
		System.out.println("bool1 &&bool2=" + (res1 && res2));

                //logical or
		System.out.println("bool1 ||bool2=" + (res1 || res2));

		        // logical not
		System.out.println("(!(bool1 &&bool2)=" + !(res1 && res2));

	}

}
