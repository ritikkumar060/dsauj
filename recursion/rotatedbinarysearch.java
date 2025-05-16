package recursion;
public class rotatedbinarysearch {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int target=0;
	    int a=binarysearch(arr,target,0,arr.length-1);
	   
	    System.out.println(a);
		System.out.println("Hello World");
    }

     
static int binarysearch(int []arr,int target,int low,int high){
    int mid=low+(high-low)/2;
    if(low>high){
        return -1;
    }
    if(arr[mid]==target){
        return mid;
    }
    else if(arr[low]<=arr[mid] ){
        if(arr[low]<target && arr[mid]>target){
            return binarysearch(arr,target,0,mid-1);
        }
        else{
            return binarysearch(arr,target,mid+1,high);
        }
    }
    else
    {
        if(arr[mid]<target && arr[high]>target){
            return binarysearch(arr,target,mid+1,high);
        }
        else{
            return binarysearch(arr,target,0,mid-1);
        }
    }
}

}