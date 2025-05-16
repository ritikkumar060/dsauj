public class binarysearchagnostic {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int []arr={9,8,7,6,5,4,3,2,1};
		int key=2;
		int p=binarysearch(arr,key);
		System.out.println(p);
	}
	static int binarysearch(int []arr, int key){
	    int low=0;
	    int high=arr.length-1;
	    boolean ags=arr[low]<arr[high];
	    
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(arr[mid]==key){
	            return mid;
	        }
	        else if(arr[mid]>key){
	            if(ags){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        else{
	            if(ags){
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
