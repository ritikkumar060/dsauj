/*
    *
    **
    ***
    ****
    *****
 */


//package pattern;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
    }

    static void patterns(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

