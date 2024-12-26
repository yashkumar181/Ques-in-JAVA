package LoopsAndOtherBasics;
import java.util.Scanner;
public class sumOfSquareOfAllEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum+=Math.pow(i,2);
            }
        }
        System.out.println("the sum is: "+sum);
    }
}
