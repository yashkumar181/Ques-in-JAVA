package Array;
import java.util.Scanner;

public class largestElementInEachRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of square matrix: ");
        int n=sc.nextInt();
        int [][] arr=new int[n][n];
        System.out.println("enter the elements of matrix: ");
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int max;
        for(int i=0;i<n;i++ ){
            max=arr[i][0];
            for(int j=0;j<n;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println("max elemsnt o row "+(i+1)+" is "+max);
        }
    }
}
