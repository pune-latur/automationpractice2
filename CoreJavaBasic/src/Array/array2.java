package Array;
import java.util.Arrays;
import java .util.array;
public class array2 {
//java program to clone the array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] ={33,3,4,5};
 System.out.println ("printing original array:");
 for (int i:arr) {
	 System.out.println("printing clone if the array:");
	 int carr[]=arr.clone();
	 for (int i:carr) {
		 System.out.println(i);
	 }
	 System.out.println("are both equal arr&carr ?");
	 System.out.println(Arrays.equals(arr, carr));
	 System.out.println("**************");
	 int 
	 newcopiedarray[]=arrays.copyof(arr,arr.length);
	 for(int i:newcopiedarray) {
		 System.out.println(i);
	 }
	 System.out.println("**************");
int newcopiedrangearray[]=arrays.copyofrange(arr,0,3);
for (int i:newcopiedrangearray){
	system.out.println(i);
}
	 }
 }
 
	}

}
