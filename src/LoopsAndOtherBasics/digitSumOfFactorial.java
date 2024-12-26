package LoopsAndOtherBasics;
import java.util.Scanner;
public class digitSumOfFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int facto=1,sum=0;
        for(int i=1;i<=n;i++){
            facto*=i;
        }
        System.out.println("the factorial is: "+facto);
        while(facto!=0){
            int rem=facto%10;
            sum+=rem;
            facto/=10;
        }
        System.out.println("the sum of digits of factorial is: "+sum);
    }
}
