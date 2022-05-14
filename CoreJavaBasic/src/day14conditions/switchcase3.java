package day14conditions;

public class switchcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10 ,num2=5;
        char op='%';
        int res;
		switch (op) {
        case '-' :
        	res= num1-num2;
 	   System.out.println("num1-num2="+res);
 	   break;
        case'+' :
        	res = num1+num2;
     	   System.out.println("num1+num2="+res);
break;
        case '/' :
        res=num1/num2;
 	   System.out.println("num1/num2="+res);
break;   }
	}
     static double call(char op,int num1,int num2) {
    	 
        	int res1=0;
		
        	switch (op) {
        	case'-':
        		res1=num1-num2;
        		   System.out.println("num1-num2:"+res1);
          return res1;
        	case'+':
        		res1=num1+num2;
     		   System.out.println("num1+num2:"+res1);
           return res1;
        	case'/':
        		res1=num1/num2;
     		   System.out.println("num1/num2:"+res1);
return res1;
        	}
			return res1;
			
        }
 
        
	

}
