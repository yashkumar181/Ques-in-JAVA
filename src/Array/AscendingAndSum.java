package Array;
import java.util.Scanner;
public class AscendingAndSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter th eelements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];}
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n sum is: "+sum);


    }
}
