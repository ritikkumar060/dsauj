import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int []a={1,20,13,4,55,26,37};
        for (int i=0;i<a.length/2;i++){
         int temp=a[i];
         a[i]=a[a.length-1-i];
         a[a.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(a));
    
    }
    
}
