/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
 
 */
//package pattern;
import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();



        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        int nst=n;
        int nsp=-1;
        for (int i=0;i<2*n;i++){
            if(i==n){

            }
            else if(i<n){
                nst--;
                nsp++;
            }
            else
            {
                nst++;
                nsp--;
            }
            for (int k=0;k<nsp;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=nst;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    
}
