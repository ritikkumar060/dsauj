package recursion;

import java.util.Scanner;

public class noofzeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int n=sc.nextInt();
        int f=totalzeros1(0,n);
        System.out.println("total no of zeros in "+n+" is "+f);
        int f1=totalzeros(n);
        System.out.println("total no of zeros in "+n+" is "+f1);
        sc.close();
    }
    static int z=0;
    static int totalzeros(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            z++;
        }
        totalzeros(n/10);
        return z;
    }


    static int totalzeros1(int c,int n){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
        }
        c=totalzeros1(c,n/10);
        return c;
    }





}
