/*
       1      1
       12    21
       123  321
       12344321

 */
import java.util.*;
public class pattern35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        int nsp=2*n-2;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                
                System.out.print(j+1+" ");    
            }
            for (int k=0;k<nsp;k++){
                System.out.print("  ");
            }
            nsp=nsp-2;
            int p=i+1;
            for (int m=0;m<=i;m++){
                System.out.print(p+" ");
                p--;
            }
            System.out.println();
        }
    }
}
