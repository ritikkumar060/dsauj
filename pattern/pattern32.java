/*
       E
       D E
       C D E
       B C D E
       A B C D E

 */
import java.util.*;
public class pattern32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                
                System.out.print((char)(64+n-i+j)+" ");
                
            }
            System.out.println();
        }
    }
}
