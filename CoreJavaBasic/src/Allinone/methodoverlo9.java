package Allinone;

public class methodoverlo9 {
	void display(int a, double b) {
		System.out.println("method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("method B");
	}

	public void disp(int a, int b, int c) {
		System.out.println("method c");

	}

	void disp(int x, int y) {
		System.out.println("method D");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverlo9 obj2 = new methodoverlo9();
		obj2.disp(100, 66);
		obj2.disp(22, 88, 7);
		obj2.disp(6, 6.7,88.9);
		obj2.disp(77,84.0);
	}
}
