package recursion;

import java.util.Scanner;

public class sumofdigitofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        int f=sumofdigit(n);
        System.out.println("sum of digit of "+n+" is "+f);
        sc.close();
    }
    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumofdigit(n/10);
    }
}
