/*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

 */
import java.util.*;
public class pattern22 {
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
                if((i+j)%2==0)
                System.out.print(1+" ");
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
