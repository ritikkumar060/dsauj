/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    * 
*/
//package pattern;
import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        int nst=0;
        for (int i=0;i<2*n-1;i++){
            if (i<n){
                nst++;
            }
            else{
                nst--;
            }
            for (int j=0;j<nst;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    
}
