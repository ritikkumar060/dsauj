package recursion;

import java.util.Scanner;

public class productofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        int f=productofdigits(n);
        System.out.println("product of digit of "+n+" is "+f);
        sc.close();
    }
    static int productofdigits(int n){
        if(n/10==0){
            return n;
        }
        return n%10*productofdigits(n/10);
    }
    
}
