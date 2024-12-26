package LoopsAndOtherBasics;
import java.util.Scanner;

public class gcdLcm {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        System.out.println("the gcd of "+a+" and "+b+" is "+ gcd(a,b));

        int lcm=(a*b)/gcd(a,b);
        System.out.println("the lcm of "+a+" and "+b+" is "+ lcm);


    }
}
