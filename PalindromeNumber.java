import java.util.*;
public class PalindromeNumber {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    n=Math.abs(n);
    int num=n;
    int reverse=0;
    while(n>0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
    }
        if(num==reverse){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    }
