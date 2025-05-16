//1095 find in Mountain array

/*You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

 

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 

Constraints:

3 <= mountain_arr.length() <= 104
0 <= target <= 109
0 <= mountain_arr.get(index) <= 109 */






public class leetcode6 {
    public static void main(String[] args) {
        int []arr={1,3,4,5,3,2,1};
        int target=2;
        int x= search(arr,target);
        System.out.println("element found at index "+x );

    }
     static int search(int []arr ,int target){
        int p=peak(arr);
        int x=binarySearch(arr,target,0,p);
        if (x==-1){
            int c=binarySearch(arr,target,p,arr.length-1);
            return c;
        } 
        else {
            return x;
        }
     } 

     static int peak(int []arr){
        int low=0;
        int high=arr.length-1;
        while(low!=high){
            int mid=low+(high-low)/2;
            if (arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
     }
     static int binarySearch(int []arr,int target,int low,int high){
        boolean asc=arr[low]<arr[high];
        if (asc){
            while(low<=high){
                int mid=low+(high-low)/2;
                if (arr[mid]<target){
                  low=mid+1;
                }
                else if (arr[mid]>target){
                    high=mid-1;
                }
                else {
                    return mid;
                }
            }
            return -1;
        }
        else{
            while(low<=high){
                int mid=low+(high-low)/2;
                if (arr[mid]>target){
                  low=mid+1;
                }
                else if (arr[mid]<target){
                    high=mid-1;
                }
                else {
                    return mid;
                }
            }
            return -1;
        }
        }
     }

     