package Array;
import java.util.Scanner;
public class medianOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int median;
        if(n%2==0){
            median=(arr[n/2]+arr[(n/2)-1])/2;
        }else{
            median = arr[(n-1)/2];
        }
        System.out.println("the median of athe array is : "+median);


    }
}
