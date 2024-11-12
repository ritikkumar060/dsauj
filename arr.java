// import java.util.Arrays;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a=new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    System.out.println();
     
    
    
    for (int num:a){
        System.out.print(num+" ");
     }
    
    System.out.println(Arrays.toString(a));

        sc.close();
    }
}
