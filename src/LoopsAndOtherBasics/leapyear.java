package LoopsAndOtherBasics;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the year: ");
        int n=sc.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("not a leap year");
    }
}
}
