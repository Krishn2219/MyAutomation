package Company;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 
{
	public static void main (String [] args) 
	{
		int [] input1 = {1,2,4};
		int [] input2 = {0,0,2};
	    int [] input3 = {2,9,9};
	   
//	   String output1 = arrayToString(addition(input1));
//	   String output2 = arrayToString(addition(input2));
//	   String output3 = arrayToString(addition(input3));
	    
	    int [] output1 = addition(input1);
	    int [] output2 = addition(input2);
	    int [] output3 = addition(input3);

	    System.out.println("output 1: " + java.util.Arrays.toString(output1));
	    System.out.println("output 2: " + java.util.Arrays.toString(output2));
	    System.out.println("output 3: " + java.util.Arrays.toString(output3));

	    
//	    System.out.println("output 1: " + output1);
//	    System.out.println("output 2: " + output2);
//	    System.out.println("output 3: " + output3);

	}
	
	public static int [] addition(int[] digit) 
	{
		for (int i= digit.length-1; i>=0; i--) 
		{
			if(digit[i]<9) {
				digit[i]++;
				return digit;
			}else {
				digit[i]=0;
			}
		}
		
		int[] result = new int[digit.length +1];
		result[0]=1;
		return result;
	}
	
//	public static String arrayToString(int[] arr) {
//		StringBuilder sb = new StringBuilder();
//		 for(int num : arr){
//			sb.append(num);
//		}
//		 return sb.toString();
		
//	}
	

}


