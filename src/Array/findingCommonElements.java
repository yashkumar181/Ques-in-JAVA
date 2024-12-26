package Array;
import java.util.Scanner;
public class findingCommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array 1: ");
        int n=sc.nextInt();
        int [] arr1=new int [n];
        System.out.println("enter the value of the array: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of array 2: ");
        int m=sc.nextInt();
        int [] arr2=new int [m];
        System.out.println("enter the value of the array: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
