package Array;
import java.util.Scanner;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int nsum=max*(max+1)/2;
        int net=nsum-sum;
        System.out.println("missing number is: "+net);
    }
}
