package LoopsAndOtherBasics;
import java.util.Scanner;
public class divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}
