package forloopassignment;

public class ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 55;
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd  number");// 55%2=27
		}
		ifcondition.checkevenoddnumber(700);
		checkevenoddnumber(711);
	}

	static void checkevenoddnumber(int num) {
		if (num % 2 == 0) {
			System.out.println("given number is even number:" + num);// 700

		} else {
			System.out.println("given number is odd number:" + num);// 711

		}
	}

	static boolean isnumbereven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static void checkevenoddnumber2() {
		int num = 50;
		if (num % 2 == 0) {
			System.out.println("given number is even number:" + num);
		} else {
			System.out.println("given number is odd number:" + num);

		}
	}
}
