package LoopsAndOtherBasics;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int len = 0, rem;
        int temp = n;
        while (n > 0) {
            n /= 10;
            len++;
        }
        double sum = 0;
        n = temp;
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, len);
            n /= 10;
            rem = 0;
        }
        if (sum == temp) {
            System.out.println("armstrong ");
        }else{
            System.out.println("not armstrong");
        }
    }
}
