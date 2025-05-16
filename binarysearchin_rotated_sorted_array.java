public class binarysearchin_rotated_sorted_array {
    public static void main(String[] args) {
	    
	    int []arr={8,1,2,3,4,5,6,7};
        int target=6;
	    int a=binarysearch(arr,target);
	   
	    System.out.println(a);
		System.out.println("Hello World");
	}
	static int binarysearch(int []arr,int target){
	    int low=0;
	    int high=arr.length-1;
	    
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(arr[mid]==target){
	            return mid;
	        }
	        else if(arr[low]<arr[mid])
            {
                if(target>arr[low] && target<arr[mid])
                {
	            high=mid-1;
	        }
            else
            {
                low=mid+1;
            }
        }
        else
        {
           if(target>arr[mid] && target<arr[high]){
            low=mid+1;
            
           }
           else{
           high=mid-1;
           }
        }
	    }
	    return -1;
	}
}
