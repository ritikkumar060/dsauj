/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */

//package pattern;
import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        patterns(n);
    }
    static void patterns(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
}
