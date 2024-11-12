//best case time complexity:O(N)   already sorted array
//Worst case time complexity:O(N**2)   decreasing order array   
// it is a stable sorting algorithm that means an unsorted array (10a,20a,20b,30,10b) will be (10a,10b,20a,20b,30) that is  the order will be maintained 


//package Bubblesort;
import java.util.*;
public class bubblesorting {
    public static void main(String[] args) {
        // int []arr={3,2,5,1,0,7,-1};
        int []arr={1,2,3,4,5,6};
        sorting(arr);
    }
    static void sorting(int []arr){
        boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped=false;
            for (int j=0;j<arr.length-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    // at every iteration the ith largest element gone to the ith index from the last
                }
            }
            if (!swapped){// if swapping will not take place that means it is sorted array
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
