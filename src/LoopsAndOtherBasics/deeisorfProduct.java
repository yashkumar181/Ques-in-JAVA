package LoopsAndOtherBasics;
import java.util.Scanner;
public class deeisorfProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first number: ");
        int n=sc.nextInt();
        System.out.println("enter the second number: ");
        int m=sc.nextInt();
        int prod=n*m;
        for(int i=1;i<prod;i++){
            if(prod%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}
