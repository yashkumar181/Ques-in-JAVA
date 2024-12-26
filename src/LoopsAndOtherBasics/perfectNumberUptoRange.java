package LoopsAndOtherBasics;
import java.util.Scanner;
public class perfectNumberUptoRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();

        int count=0;
        for(int j=1;j<=n;j++){
            int sum=0;
        for(int i=1;i<j;i++){
            if(j%i==0){
                sum+=i;
            }
        }
            if (j==sum){
                //System.out.println("perfect.");
                count++;
            }
        }

        System.out.println(count);
        //else{
         //   System.out.println("not perfect.");
       // }
    }
}
