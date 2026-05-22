import java.util.*;
public class LcmOfTwoNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=a;
        int b=sc.nextInt();
        int y=b;
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        int d=a;
        int lcm=(x*y)/d;
        System.out.println(lcm);
        
    }
}
