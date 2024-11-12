// // i have to find out the floor of target element i.e. the largest number in an array which is either equal or less than the given target element


// import java.util.*;
// import java.math.*;
public class floorElement {
    public static void main(String[] args) {
        int [] arr={1,3,54,67,88,90,1243,5432,7676};
        int target=0;
        int x=floor(arr,target);
        System.out.println("the floor element of target element is "+x );
    }

    static int floor(int []arr,int target){
        int low=0;
        int high=arr.length-1;
      if (arr[high]<target){
        return arr[high];
      }
    //   if (arr[low]>target){
    //     return Math.MIN_VALUE;
    //   }
      
        while(low<=high){
            int mid=low+(high-low)/2;
      
      
            if (arr[mid]>target){
                if (arr[mid-1]<target){
                    return arr[mid-1];
                }
                else{
                    high=mid-1;
                }
            }
      
      
            else if(arr[mid]<target){
                if (arr[mid+1]>target){
                    return arr[mid];
                }
                else{
                    low=mid+1;
                }
            }
      
      
            else{
                return arr[mid];
            }
      
      
        }
        return -1;
    }


    
}
