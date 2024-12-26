package Patterns;
import java.util.Scanner;
public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                if(((i+j)>=(n+3)/2)&&((j-i)<=(n-1)/2)&&((i+j)<=((3*n)+1)/2)&&((j-i)>=(1-n)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
