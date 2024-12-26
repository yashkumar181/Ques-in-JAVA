package String;
import java.util.Scanner;
public class frequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        int count=1;
        int maxcount=1;
        char ch=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                }
            System.out.println(str.charAt(i)+":"+count);
            count=0;

        }// not correct

        }
    }
