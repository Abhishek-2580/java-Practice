import java.util.*;
public class ElseIfStatement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>100){
            System.out.println("Big");
        }
        else if(num<10){
            System.out.println("Small");
        }
        else{
            System.out.println("Number");
        }

    }
}
