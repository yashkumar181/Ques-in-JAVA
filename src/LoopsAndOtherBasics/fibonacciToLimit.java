package LoopsAndOtherBasics;
import java.util.Scanner;
public class fibonacciToLimit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the limit: ");
        int n=sc.nextInt();
        int fibo0=0,fibo1=1,fibo=0;
        while(fibo1<=n){
            System.out.print(fibo+" ");
            fibo=fibo0+fibo1;
            fibo0=fibo1;
            fibo1=fibo;
        }
    }
}
