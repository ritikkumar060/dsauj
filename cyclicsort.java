// it is a method of sorting in which we sort the array if the number is (0 to n) or (1 to n)
// time complexity =O(N)
// we can use this in find duplicate element ,missing element type question 
// space complexity =O(1)
// hint for cyclic sort :-You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
import java.util.*;
public class cyclicsort {
    public static void main(String[] args) {
        int []arr={4,2,3,0,1};
        //int []arr={4,2,1,3,0,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
// if element are starting from 1 up to n then also use below concept
            /*
            if(arr[i]==arr.length)
	        {
	           i++;
	           continue;
	        }
           */
            if(arr[i]!=arr[correct]){
                // swap it with their real position in the array
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
}
