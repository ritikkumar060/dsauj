package recursion;

import java.util.Scanner;

public class sumupton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        int f=sum(n);
        System.out.println("sum of number upto  "+n+" is "+f);
        sc.close();
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
