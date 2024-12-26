package String;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str1=sc.next(); // remember this
        String rev="";         // remember string declaration
        for(int i=str1.length()-1;i>=0;i--){
            rev= rev +str1.charAt(i);
        }
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=rev.charAt(i)){
                count ++;
            }
        }
        if(count>0){
            System.out.println(str1 + " is not a palindrome.");
        }else{
            System.out.println(str1 + " is a palindrome.");
        }

    }

}
