package LoopsAndOtherBasics;
import java.util.Scanner;
public class factorial {
    public static int facto(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        System.out.println("the factorial of "+n+" is: "+ facto(n));
    }
}
