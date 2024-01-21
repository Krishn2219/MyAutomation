package Company;

import java.util.Arrays;

import io.restassured.RestAssured;

public class test3 
{

	public static void main (String[] args) 
	{
		int [] numbers = {3,1,8,6,8,9,-1};
		int sum = Arrays.stream(numbers).sum();
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int number : numbers) {
			if (number > largest) {
				secondLargest =largest;
				largest = number;
			}else if(number >secondLargest && number != largest) {
				secondLargest = number;
			}
		}
		
      if(secondLargest!=Integer.MIN_VALUE) {
    	  System.out.println("Second Largest number is : " + secondLargest);
      }else {
    	  System.out.println("no second largest found");
      }
    }
}

//https://twitter.com/gettweets/user_id?limit=<>&keyword=<