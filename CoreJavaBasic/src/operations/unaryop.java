package operations;

public class unaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		System.out.println("x=:" + x--);//6
		System.out.println("x=:" + x);//5
		
		int y = 5;
		System.out.println("y=:" + y++);//5
		System.out.println("y=:" + y);//6
		
		int c = 7;
		System.out.println("c=:" + --c);//6
		System.out.println("c=:" + c);//6
		
		int g = 3;
		System.out.println("g=:" + ++g);//4

	}

}
