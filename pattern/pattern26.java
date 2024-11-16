/*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

 */
import java.util.*;
public class pattern26 {
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
                
                System.out.print(i+1+" ");
                
            }
            System.out.println();
        }
    }
}
