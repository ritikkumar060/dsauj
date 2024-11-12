/*
 Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 */
import java.util.*;
public class leetcode7 {
    public static void main(String[] args) {
       int []arr={4,3,2,7,8,2,3,1};
       search(arr);
       System.out.println(Arrays.toString(arr));
       for (int i=0;i<arr.length;i++){
        if (arr[i]!=(i+1)){
            System.out.println(i+1+" ");
        }
       }
      // System.out.println(Arrays.toString(missing)); 
    }
    
    static void search(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
            {
                i++;
            }
        }
        
        //return new int[] {a,b};
    }
}
