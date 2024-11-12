
import java.util.Arrays;
public class vararg {
    public static void main(String args []){
      fun(1,2,3,4,5,6,76,6,7,8,6,8,6,7,9);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
