package Array;
import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("largest: "+max+" smallest: "+min);
    }
}
