package LoopsAndOtherBasics;
import java.util.Scanner;
public class perfectSquareInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limit: ");
        int low=sc.nextInt();
        System.out.println("enter upper limimt: ");
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            for(int j=1;j<=i;j++){
                if(j*j==i){
                    System.out.print(i +"\t");
                }
            }
        }
    }
}
