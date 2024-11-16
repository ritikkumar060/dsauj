/*
     *********
      *     *
       *   *
        * *
         *

 
 */
//package pattern;
import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();



        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        int nst;
        int nsp=0;
        int nsp1=n;
        for (int i=0;i<n;i++){
            if(i==0){
                nst=2*n-1;
            }
            else if (i==n-1){
                nst=1;
            }
            else
            {
                nst=2;
            }
            for (int k=0;k<nsp;k++){
                System.out.print(" ");
            }

            for (int j=0;j<nst;j++){
                System.out.print("*");
                if(i>0){
                for(int m=0;m<nsp1;m++){
                    System.out.print(" ");
                }
                
                }
            }
            if(i>0){
                nsp1=nsp1-2;
            }
            nsp++;
            System.out.println();
        }
    }

    
}
