//Input: n = 4
//Output: true
//Explanation: 4 is not divisible by 100 and is divisible by 4 so its a leap year
import java.util.*;
class leap{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int n=sc.nextInt();
		if(n%400==0){
		  System.out.println("true");
		}
		else if (n%4==0 &&n%100!=0){
		  System.out.println("true");
		}
		System.out.println("false");
	}
}

			
		
		