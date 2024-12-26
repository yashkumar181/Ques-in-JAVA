package LoopsAndOtherBasics;
import java.util.Scanner;
public class primeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limit:");
        int low=sc.nextInt();
        System.out.println("enter upper limimt:");
        int high=sc.nextInt();
        int sum=0;
        for(int i=low;i<=high;i++){
            int count=0;
            for(int j=2;j<i;j++){

                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                sum+=i;
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n sum is: "+sum);
    }
}
