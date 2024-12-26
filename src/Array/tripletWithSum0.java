package Array;
import java.util.Scanner;
public class tripletWithSum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("["+arr[i]+","+ arr[j]+"," +arr[k]+"]");
                    }
                }
            }
        }
    }
}
