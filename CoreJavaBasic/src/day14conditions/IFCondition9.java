package day14conditions;

public class IFCondition9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int weight=51;
		if(age>= 18) {
			if (weight>50) {
            System.out.println("you are eligiable to donate blood");
			}else {
				
		   System.out.println("you are not eligiable to donate blood ,as your weight is below 50");
			}
			} else {
		   		  System.out.println("you are  not eligiable to donate blood ,as your age is below 18");


			}
		}
	}

