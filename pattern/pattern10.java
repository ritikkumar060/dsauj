/*
         *
        * *
       * * *
      * * * *
     * * * * *


 
 */
//package pattern;
import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();



        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        for (int i=0;i<n;i++){
            for (int k=0;k<n-1-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    
}
