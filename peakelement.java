public class peakelement {
    public static void main(String[] args) {
	    
	    int []arr={1,1,3,1};
	    int a=peakelement1(arr);
	    
	    System.out.println(a);
		System.out.println("Hello World");
	}
	static int peakelement1(int []arr){
	    int low=0;
	    int high=arr.length-1;
	    if(arr[high]>arr[low]){
	        return arr[high];
	    }
	    while(low!=high){
	        int mid=low+(high-low)/2;
	        if(arr[mid]>arr[low]){
	            low=mid;
	        }
	        else{
	            high=mid;
	        }
	    }
	    return arr[low];
	}
}
