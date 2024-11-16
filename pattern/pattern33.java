/*
i didn't find the right solution
       a
       B c
       D e F
       g H i J
       k L m N o

 */
import java.util.*;
public class pattern33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        sc.close();
        patterns(n);
            
        
    }
    
    static void patterns(int n){
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                if((i+j)%2==0)
                System.out.print((char)(97+k)+" ");
                else
                {
                    System.out.print((char)(65+k)+" ");
                }
                k++;
            }
            System.out.println();
        }
    }
}
