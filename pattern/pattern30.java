/*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

 */
import java.util.*;
public class pattern30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        int nsp=n-1;
        for (int i=0;i<n;i++){
           
            for (int j=0;j<nsp;j++){
                System.out.print(" ");
            }
             nsp--;
            int nst=i+1;
            for (int k=0;k<=i;k++){
               System.out.print(nst);
               nst--;
            }
            for (int m=2;m<=i+1;m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
