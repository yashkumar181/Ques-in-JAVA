package LoopsAndOtherBasics;
import java.util.Scanner;
public class checkingPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 1) {
            System.out.println("perfect square");
        } else {
            for (int i = 1; i <= n / 2; i++) {
                if (i * i == n) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("perfect square");
            } else {
                System.out.println("not perfect square");
            }
        }
    }
}
