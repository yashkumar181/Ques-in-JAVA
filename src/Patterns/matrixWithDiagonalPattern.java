package Patterns;
import java.util.Scanner;
public class matrixWithDiagonalPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int [][]arr=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j)||(i+j)<2*i){
                    System.out.print("1 \t");
                }else{
                    System.out.print("0 \t");
                }
            }
            System.out.println();
        }

    }
}
