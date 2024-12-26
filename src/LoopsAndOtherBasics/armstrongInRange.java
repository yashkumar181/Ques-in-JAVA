package LoopsAndOtherBasics;
import java.util.Scanner;
public class armstrongInRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a lower limit: ");
        int low=sc.nextInt();
        System.out.println("enter an upper limit: ");
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            int temp=i;
            int count=0,sum=0;
            while(i>0){
                i/=10; count++;
            }
            i=temp;
            while(temp!=0){
               int rem=temp%10;
               sum+=Math.pow(rem,count);
               temp/=10;
            }

            if(i==sum){
                System.out.print(i+"\t");
            }
        }
    }
}
