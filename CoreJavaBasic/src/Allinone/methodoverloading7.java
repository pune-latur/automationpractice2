package Allinone;

class methodoverloading7 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;

	}

	static void call() {
		System.out.println("i am call of adder class");

	}

	public static class adder {
		static void call() {
			System.out.println("i am call of adder class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodoverloading7.add(22, 33));
		System.out.println(methodoverloading7.add(27, 36, 55));
		methodoverloading.call();
	}

}
