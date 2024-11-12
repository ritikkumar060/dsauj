// worst time complexity:O(N**2)
// best time complexity:O(N)
// no of swaps reduced as compared to bubble sort
// it is a stable sorting algorithm
// used for small list/array 
import java.util.*;
public class insertionsort {
public static void main(String[] args) {
    // int []arr={6,4,8,5,0,1};
    int []arr={6,4,8,-3,5,0,-32,1};
    int j;
    for (int i=1;i<arr.length;i++){
        int key=arr[i];
        for (j=i-1;j>=0;j--){
           if(arr[j]>key){
            arr[j+1]=arr[j];
           }
           else{
            break;
           }
            
           
        }
        arr[j+1]=key;
    }
    System.out.println(Arrays.toString(arr));
}    
}
