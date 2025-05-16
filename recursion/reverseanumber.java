package recursion;

import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        reverse(n);
        System.out.println((sum));
        //System.out.println("sum of digit of "+n+" is "+f);
        sc.close();
    }
    static int  sum=0;
    static void reverse(int n){
        if(n==0){
            return ;
        }
       sum=sum*10+n%10;
        reverse(n/10);
        
    }
}
