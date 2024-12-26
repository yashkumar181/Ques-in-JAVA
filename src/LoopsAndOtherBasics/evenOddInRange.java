package LoopsAndOtherBasics;
import java.util.Scanner;
public class evenOddInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limit:");
        int low=sc.nextInt();
        System.out.println("enter upper limit:");
        int high=sc.nextInt();
        int sumeven=0,sumodd=0;
        for(int i=low;i<=high;i++){
            if(i%2==0){
                sumeven+=i;
            }else{
                sumodd+=i;
            }
        }
        System.out.println("sum o all even numbers are: "+sumeven+" and summ of odd number is: "+sumodd);
    }
}
