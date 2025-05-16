// Count sort is non comparison sorting algorithm
// it is best for small no array
// it does not work good for double value and large valued array
// STEPS TO SORT THE ARRAY USING COUNT SORT
// 1. Find out largest element
// 2. Create an array of size large+1
// 3. Create a frequency array (index no = element of array)
// 


import java.util.Arrays;
import java.util.*;
public class countsort {
    public static void countingsort(int [] arr){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
             if(arr[i]>large){
                large=arr[i];
             }
        }

        int [] countarr=new int[large+1];
        for(int i=0;i<arr.length;i++){
            countarr[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<countarr.length;i++){
          while(countarr[i]!=0){
            arr[k]=i;
            k++;
            countarr[i]--;
          }
        }
    }

    // create count sort using hashmap
    public static void counsorthash(int [] arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        Map<Integer,Integer> countMap= new HashMap<>();
        for(int num:arr){
        countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int i=min;i<=max;i++){
            int count=countMap.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                arr[index]=i;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,3,0,2,4,5,5,2,6};
        counsorthash(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
