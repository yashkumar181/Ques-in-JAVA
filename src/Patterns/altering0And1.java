package Patterns;
import java.util.Scanner;
public class altering0And1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix: ");
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    System.out.print("0 \t");
                }else{
                    System.out.print("1 \t");
                }
            }
            System.out.println();
        }
    }
}
