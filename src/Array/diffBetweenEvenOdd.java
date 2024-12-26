package Array;
import java.util.Scanner;

public class diffBetweenEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] even=new int[n];
        int[] odd=new int[n];
        int cnteven=0,cntodd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[cnteven++]=arr[i];
            }else{
                odd[cntodd++]=arr[i];
            }
        }
        int sumeven=0,sumodd=0;
        for(int i=0;i<cnteven;i++){
            sumeven+=even[i];
        }
        for(int i=0;i<cntodd;i++){
            sumodd+=odd[i];
        }
        System.out.println("net diff is: "+ (sumeven-sumodd));
    }
}
