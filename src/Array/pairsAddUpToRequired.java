package Array;
import java.util.Scanner;
public class pairsAddUpToRequired {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size o an array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the sum you want to find out:");
        int num=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
