package String;
import java.util.Scanner;
public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            count ++;
        }
        System.out.println(count);
    }
}
