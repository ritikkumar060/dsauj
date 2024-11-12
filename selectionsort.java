// worst time complexity:O(N**2)
//Best time complexity: O(N**2)
// it is stable sorting algorithm
// it is useful for small list/array 
import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
         int []arr={4,5,2,0,8,7};
      
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
              if (arr[j]<arr[min]){
                min=j;
              }   
            }
            if(min !=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
