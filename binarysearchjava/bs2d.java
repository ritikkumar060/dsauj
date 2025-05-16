package binarysearchjava;
import java.util.*;
public class bs2d {
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int key=19;
        int []a=search(arr,key);
        System.out.println(Arrays.toString(a));
    }
  
    static int[] binarysearch(int [][]nums,int key,int start,int end , int row){
        while(start<=end){      
        int mid=(start+end)/2;
        if(nums[row][mid]==key){
            return new int[]{row,mid};
        }    
        else if(nums[row][mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return new int[]{-1,-1};

    }
    static int[] search(int [][]arr,int key){
        if(arr.length<2){
            return binarysearch(arr,key,0,arr[0].length-1,0);
        }
        int cstart=0;
        int cend=arr[0].length-1;
        int cmid=(cstart+cend)/2;
        int rstart=0;
        int rend=arr.length-1;
        while(rend-rstart>1){
            int rmid=(rstart+rend)/2;
            if(arr[rmid][cmid]==key){
                return new int[] {rmid,cmid};
            }
            else if(key>arr[rmid][cmid]){
                rstart=rmid;
                
            }
            else{
                rend=rmid; 
            }
        }
        // now we have two rows 
        // check wheather the target is in the col of 2 rows
        if(arr[rstart][cmid]==key){
            return new int[]{rstart,cmid};
        } 
        
        else if(arr[rend][cmid]==key){
            return new int[]{rend,cmid};
        } 
         // search in first half
         else if(key<arr[rstart][cmid]){
            return binarysearch(arr,key,0,cmid-1,rstart);
         }
         // search in 2nd half
        else if(key<arr[rend][0]){
            return binarysearch(arr,key,cmid+1,arr[rstart].length-1,rstart);
         }
         // search in 3rd half
         else if(key<arr[rend][cmid]){
            return binarysearch(arr,key,0,cmid-1,rend);
         }
         else{
         return binarysearch(arr,key,cmid+1,arr[rend].length-1,rend);
         }
} 
}
