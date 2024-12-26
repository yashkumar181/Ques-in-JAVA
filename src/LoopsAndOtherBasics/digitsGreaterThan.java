package LoopsAndOtherBasics;
import java.util.Scanner;
public class digitsGreaterThan {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        System.out.println("enter the digit you want o find: ");
        int n=sc.nextInt();
        int count=0;
        int rem;
        while(num>0){
            rem=num%10;
            if(rem>n){
                count++;
            }
            num/=10;
        }
        System.out.println("there are "+count+" digits greater than "+n);
    }
}
