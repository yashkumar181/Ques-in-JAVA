package LoopsAndOtherBasics;
import java.util.Scanner;
public class fibonacciUsingRecursion {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limimt: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " "); // Print Fibonacci numbers up to n
        }
    }
}
