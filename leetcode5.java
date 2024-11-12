/*  
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. 
*/

public class leetcode5{
    public static void main(String[] args) {
        int []a={1,3,5,7,9,8,6};
        int x=peakelement(a);
   System.out.println(x);
    }

    static int peakelement(int []nums){
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low!=high){
            mid=low+(high-low)/2;
            
           if (nums[mid]<nums[mid+1]){
            low=mid+1;
           }
           else{
            //(nums[mid]>nums[mid+1]){
            high=mid;
           }
        }
        return low;
    }
}

