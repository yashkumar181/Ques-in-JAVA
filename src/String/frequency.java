package String;
import java.util.Scanner;
import java.lang.String;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number: ");
        String str=sc.next();
        System.out.println("enter the digit u want to find: ");
       String str1=sc.next();
        //int str1=sc.nextInt();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== str1.charAt(0)){
                count++;
            }
        }
        System.out.println("it occurs "+ count+" times.");
    }
}
