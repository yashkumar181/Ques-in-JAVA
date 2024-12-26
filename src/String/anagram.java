package String;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter string 1 : ");
        String str=sc.next();
        System.out.println("enter string 2 : ");
        String str1=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
        }
        if(count==str.length()){
            System.out.println(str+" and "+str1+" are anagrams.");
        }else{
            System.out.println(str+" and "+str1+" are not anagrams.");

        }

    }
}
