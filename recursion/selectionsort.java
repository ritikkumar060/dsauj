package recursion;
import java.util.*;
public class selectionsort {
    

	public static void main(String[] args) {
	    int []arr={3,4,1,2,7,0,6};
	    selection(arr,arr.length-1,0,0);
	    System.out.println(Arrays.toString(arr));
	//	System.out.println("Hello World");
	}
	static void selection(int []arr,int i,int j,int l){
	    if(i==0){
	        return;
	    }
	   if(j<i){
	    if(arr[j]>arr[l]){
	        selection(arr,i,j+1,j);
	       
	    }
	    else{
	        selection(arr,i,j+1,l);
	    }
	   }
	   else{
	    int temp=arr[i-1];
	    arr[i-1]=arr[l];
	    arr[l]=temp;
	   
	     
	    selection(arr,i-1,0,0);
	   }
	}
}

