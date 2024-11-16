/*
       E D C B A
       D C B A
       C B A
       B A
       A

 */
import java.util.*;
public class pattern34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        
        for (int i=0;i<n;i++){
            for (int j=0;j<=n-1-i;j++){
                
                System.out.print((char)(64+n-(i+j))+" ");
                
            }
            System.out.println();
        }
    }
}
