package LoopsAndOtherBasics;
import java.util.Scanner;
public class sumOfNOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<2*n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
