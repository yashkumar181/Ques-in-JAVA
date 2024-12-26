package Patterns;
import java.util.Scanner;
public class starPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height: ");
        int n=sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=(2*n)-1 ; j++) {
                if(((i+j)>=(n+1))&&((j*(n-1)-(4*i))<=((n*n)-n-4))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
