import java.util.*;
public class Garland {
    public static void main(java.lang.String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        while(n>0){
            System.out.println("Enter the red:");
            int R=sc.nextInt();
            System.out.println("Enter the green:");
            int G=sc.nextInt();
            System.out.println("Enter the blue:");
            int B=sc.nextInt();
            int max=Math.max(R,Math.max(G,B));
            int sum=R+G+B;
            if(max<=(sum-max)+1){
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
            n--;
        }
        sc.close();
    }
}
