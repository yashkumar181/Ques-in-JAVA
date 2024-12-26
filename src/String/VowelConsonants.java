package String;
import java.util.Scanner;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string: ");
        String str= sc.nextLine();
        int vow=0,conso=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
                vow++;
            }else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
                conso++;
            }
        }
        System.out.println(" Vowels: "+vow+" Consonents: "+conso);
    }
}
