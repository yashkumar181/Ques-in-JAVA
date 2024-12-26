package Array;
import java.util.Scanner;
public class squareODiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimention o square matrix: ");
        int n=sc.nextInt();

        int [][] arr=new int[n][n];
        System.out.println("enter the elemets of the array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                sum+=arr[i][j];
                }
            }
        }
        System.out.println("the sum is : "+ sum);

    }
}
