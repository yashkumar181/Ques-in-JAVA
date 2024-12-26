package LoopsAndOtherBasics;
import java.util.Scanner;
public class sumTillSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the umber:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0,rem,rem1;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        while(sum>9) {
            int sum1 = 0;
            while (sum > 0) {
                sum1 += sum % 10;
                sum /= 10;
            }
            sum = sum1;
        }
            System.out.println(sum);

    }
}
