package LoopsAndOtherBasics;
import java.util.Scanner;
public class firstNPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the limit: ");
        int n=sc.nextInt();
        int count =n,sum=0;
        for(int i=2;count>0;i++){
            int cnt=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.print( i+ "\t");
                sum+=i;
                --count;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
