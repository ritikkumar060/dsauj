/*
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


 */
import java.util.*;
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        int nst=n-1;
        int nsp=0;
        for (int i=0;i<=2*n-1;i++){
           
            for (int j=0;j<=nst;j++){
                System.out.print("*");
            }
          for (int k=0;k<nsp;k++){
            System.out.print(" ");
          }
          for(int m=0;m<=nst;m++){
            System.out.print("*");
          }
          if(i==n-1){

          }
          else if(i<n){
            nst--;
            nsp=nsp+2;
          }
          else
          {
            nsp=nsp-2;
            nst++;
          }
            System.out.println();
        }
    }
}
