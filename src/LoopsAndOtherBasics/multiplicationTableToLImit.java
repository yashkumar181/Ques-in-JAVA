package LoopsAndOtherBasics;
import java.util.Scanner;
public class multiplicationTableToLImit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter where to start: ");
        int n=sc.nextInt();
        System.out.println("enter where to end: ");
        int end=sc.nextInt();
        for(int j=1;j<=end;j++) {
            for(int i=n;i<=end;i++){
                System.out.print(i+" X "+j+" = "+i*j+"  ");
            }
            System.out.println();
        }


    }
}
