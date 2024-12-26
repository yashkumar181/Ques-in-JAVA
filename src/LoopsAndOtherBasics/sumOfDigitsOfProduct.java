package LoopsAndOtherBasics;
import java.util.Scanner;
public class sumOfDigitsOfProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first number: ");
        int n=sc.nextInt();
        System.out.println("enter the second number: ");
        int m=sc.nextInt();
        int prod=n*m;
        int sum=0;
        while(prod>0){
            int rem=prod%10;
            sum+=rem;
            prod/=10;
        }
        System.out.println(sum);
    }
}
