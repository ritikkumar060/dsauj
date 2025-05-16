package recursion;
import java.util.*;
public class printnto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        sc.close();
        print(n);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        // print(n-1);
        // System.out.println(n);   it will give output as 1  2 3 4 5 up to n
    }
}
