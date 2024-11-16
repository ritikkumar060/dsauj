/*
         *
        * *
       *   *
      *     *
     *********
 
 */
//package pattern;
import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();



        sc.close();
        patterns(n);
    }
    static void patterns(int n){
       int nst=0;
        int nsp;
        for (int i=0;i<n;i++){
            nsp=n-1-i;
            for (int k=0;k<nsp;k++){
                System.out.print(" ");
            }
            int nspp=2*i-1;
            if(i==n-1){
                nspp=0;
            }
            if(i>0 && i<n-1){
 nst=1;
            }
            else if(i==n-1){
                nst=2*n-2;
            }
            for (int j=0;j<=nst;j++){
                System.out.print("*");
                for(int m=0;m<nspp;m++){
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }

    
}
