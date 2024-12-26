package LoopsAndOtherBasics;
import java.util.Scanner;
public class largestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int count=0;
        int []arr=new int[n];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                int cnt=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        cnt++;
                    }
                    if(cnt==0){
                        arr[count++]=i;
                    }
                }
            }
        }
        int max=arr[0];
        for(int i=0;i<count;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the max prime factor is : "+max);
    }
}
