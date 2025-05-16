package recursion;
import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        int [] arr={8,3,4,12,5,6};
        int []b=divide(arr);
        System.out.println(Arrays.toString(b));
    }
      

    static int[] divide(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int []left=divide(Arrays.copyOfRange(arr,0,mid));
        int []right=divide(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
   


    static int[] merge(int []first,int[]second){
         int i=0;
         int j=0;
         int k=0;
         int []mix=new int [first.length+second.length];
         while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
               
            }
             else{
                mix[k]=second[j];
                j++;
               
             }
             k++;
             
         }
         while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
         }
         while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
         }
         return mix;
    }
}
