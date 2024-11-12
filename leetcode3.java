//34. Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1,1].
// You must write an algorithm with 0(log n) runtime complexity.
// Example 1:
// Input: nums [5,7,7,8,8,10], target = 8
// Output: [3,4]


import java.util.*;
public class leetcode3 {
public static void main(String[] args) {
    int []num={5,7,7,7,7,8,8,10};
    int target=7;
    int []n=findindex(num,target);
    System.out.println(Arrays.toString(n));
}    

static int[] findindex(int []num,int target){
    
    int q=-1,r=-1;
    int low=0;
    int high=num.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if (num[mid]==target ){
            if (num[mid-1]!=target)
            {
                q=mid;
                break;
            }
            else{
                high=mid-1;
            }
        }
        else if(num[mid]<=target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }


    low=0;
    high=num.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if (num[mid]==target ){
            if (num[mid+1]!=target)
            {
                r=mid;
                break;
            }
            else{
                low=mid+1;
            }
        }
        else if(num[mid]<=target){
            low=mid+1;
            
        }
        else{
            high=mid-1;
        }
    
// int []arr=new int[2];
// arr[0]=q;
// arr[1]=r;
    
}
return new int[]{q,r};
}
}
