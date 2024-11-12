// i have to find out the ceiling of target element i.e. the smallest number in an array which is either equal to or greater than the given target element

//import java.util.*;
public class ceiling {
public static void main(String[] args) {
    int [ ]arr={1,3,5,6,15,36,47,78};
    int target=8;

    int x=ceilingSearch(arr,target);
    System.out.println("ceiling of target element is "+x);
}    



static int ceilingSearch(int []arr,int target){
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if (arr[mid]==target){
            return arr[mid];
        }


        else if (arr[mid]>target){
            if (arr[mid-1]<target){
                return arr[mid];
            }
            else{
                high=mid-1;
            }
        }


        else{
            if (arr[mid+1]>target){
                return arr[mid+1];
            }
            else{
                low=mid+1;
            }
            
        }
    }


    return -1;

}

}
