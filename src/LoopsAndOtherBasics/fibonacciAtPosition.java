package LoopsAndOtherBasics;
import java.util.Scanner;
public class fibonacciAtPosition {
    public static int fibo(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position: ");
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        int fibo0=0,fibo1=1;
        arr[0]=fibo0;
        arr[1]=fibo1;
        int count=2;
            for(int i=2;count<(n+1);i++){
                arr[i]=fibo0+fibo1;
                fibo0=fibo1;
                fibo1=arr[i];
                ++count;
            }
        System.out.println("old:  the fibo at "+n+"th position is: "+arr[n]);
        System.out.println("new: fibo is : "+ fibo(n));
    }
}
