package LoopsAndOtherBasics;
import java.util.Scanner;
public class triangularNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int tri=n*(n+1)/2;
        System.out.println(n+"th triangular number is: "+tri);
    }
}
