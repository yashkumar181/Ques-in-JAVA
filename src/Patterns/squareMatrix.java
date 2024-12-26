package Patterns;
import java.util.Scanner;
public class squareMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix: ");
        int n=sc.nextInt();
        int cnt=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(cnt++ +"\t");
            }
            System.out.print("\n");
        }


    }
}
