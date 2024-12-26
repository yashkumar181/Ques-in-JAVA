package Patterns;
import java.util.Scanner;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number of rows: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int count =1;
            for(int j=0;j<i;j++){
                System.out.print(count++ +"\t");
            }
            System.out.print("\n");
        }
    }
}
