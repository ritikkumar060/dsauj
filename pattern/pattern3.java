/*
    *****
    ****
    ***
    **
    *
 */

//package pattern;
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number(i.e. the no of rows):");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
