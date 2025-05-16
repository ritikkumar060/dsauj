package recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("factorial of "+n+" is "+f);
        sc.close();
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
