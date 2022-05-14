package day1variables;

public class DisplayOverloading 
{
	public  void disp(char c)
	{
		System.out.println(c);
	}
		public  void disp(char c ,int num)
	{
		System.out.println(c +""+num);
	}
		public void callme() {
			System.out.println("i am call me() of DisplayOverloadng class");
		}
}

	