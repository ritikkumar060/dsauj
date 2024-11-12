import java.util.*;

public class max3num {
    public static void main (String argts[]){
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    sc.close();
    if (a>b && a>c){
        System.out.println("largest number is "+a);
    }    
      else if (b>a && b>c){
            System.out.println("largest number is "+b);
    }
    
    else {
        System.out.println("largest number is "+c);
    } 
}
}
