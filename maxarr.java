//import java.util.*;
public class maxarr {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int large=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>large){
                large=a[i];
            }
        }
      
        // work on edge case here by youeself (edge cases are like null array and other stuffs)

        System.out.println("maximum element in an  array is "+large);
    }
    
}
