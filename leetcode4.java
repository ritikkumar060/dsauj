// to find the element in an infinite sorted array with time complexity of O(logn) 
//import java.util.*;


public class leetcode4 {
    public static void main(String[] args) {
          int []arr={1,2,3,4,5,6,7,8,9,10,11,51,45,67,87,99,111,123,234,432,555,678,879,909,1001,1209,1302,1435,1675,1987,2002};
          int target=85;
          int x=search(arr,target);
          if (x==-1){
            System.out.println("element not found in the array");
          }
          else{
            System.out.println("element found at index "+x);
          }
          
          
    }
    static int search(int arr[],int target){
        if (arr[0]==target){
            return 0;
        }
        int low=1;
          int high=1;
          while(low<=high){
            if (target>=arr[low] && target<=arr[high]){
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if (arr[mid]>target){
                        high=mid-1;
                    }
                    else if(arr[mid]<target){
                        low=mid+1;
                    }
                    else{
                        return mid;
                    }

                }
                return -1;
            }
            else{
                low=high+1;
                high=high*2;
            }
          }
          return -1;
    }
    
}
