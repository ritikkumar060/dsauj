import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        int b=Integer.parseInt(args[0]);
        System.out.println(b);
        sc.close();
        int c=0;
        for (int i=2;i<a;i++){
          if (a%i==0){
            c=c+1;
          }
        }
        if (c==0){
            System.out.println("prime number");
        }
        else
         {
            System.out.println("not prime number");         }
    }
    
}
