package LoopsAndOtherBasics;
import java.util.Scanner;

public class sumOfFraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter till where you wanna find out: ");
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=1f/i; // yaha 1 ke aage f likhna zaruri hai nai toh vo pure ko int treat karega
        }
        System.out.println(sum);
    }
}
