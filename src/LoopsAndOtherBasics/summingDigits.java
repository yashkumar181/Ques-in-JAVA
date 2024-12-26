package LoopsAndOtherBasics;
import java.util.Scanner;
public class summingDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("sum of the digits are : "+ sum);
    }
}
