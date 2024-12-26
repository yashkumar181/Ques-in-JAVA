package Array;
import java.util.Scanner;
public class modeOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("ente rthe alues of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
                int mode = arr[0];
                int maxCount = 1;
                int crrCount = 1;
                for (int i = 1; i <n; i++) {
                    if (arr[i] == arr[i - 1]) {
                        crrCount++;
                    } else {
                        if (crrCount > maxCount) {
                            mode = arr[i - 1];
                            maxCount = crrCount;
                        }
                        crrCount = 1;
                    }
                }
                if(crrCount>maxCount){
                    mode=arr[n-1];
                }
        System.out.println("the mode is: "+mode);


    }
}
