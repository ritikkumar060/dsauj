import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []arr ={1,2,3,4,5,6,7,8,9};
        int target=sc.nextInt();
        int index=binary(arr,target);
        if (index==-1){
            System.out.println("element not found in the given array");
        }
        else{
        System.out.println("element found at index "+index);
        }


        sc.close();
    }





    // this is a function to do the binary search to the sorted array
   static int binary(int []arr,int target){
    int low=0;
    int high=arr.length-1;
    if (arr.length==0){
        return -1;
    }
  while(low<=high){
    int mid=(low+high)/2; // it may exceed the range of integer 
    //int mid=low+(high-low)/2;
    //above formula is used, bcz low+high may exceed the range of integer. so to solve this error we use formula mid=low+(high-low)/2   
    if (arr[mid]==target){
        return mid;
    }
        else if(arr[mid]>target){
            high=mid-1;
        }
    else{
        low=mid+1;
    }
  }
  return -1;
   }
   
   




}
