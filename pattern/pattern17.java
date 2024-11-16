/*
not completed
         1
        212
       32123
      4321234
       32123
        212
         1

 */
import java.util.*;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        int nsp=n-1;
        for (int i=0;i<2*n-1;i++){
           
            for (int j=0;j<nsp;j++){
                System.out.print(" ");
            }
             if(n==n-1){
                nsp++;
            }
            else{
                nsp--;
            }
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
