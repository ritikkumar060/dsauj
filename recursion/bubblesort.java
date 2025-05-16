package recursion;

import java.util.Arrays;

public class bubblesort {
    	public static void main(String[] args) {
	    int []arr={3,4,1,2,7,0,6};
	    bbs(arr,arr.length-1,0);
	    System.out.println(Arrays.toString(arr));
	//	System.out.println("Hello World");
	}
	static void bbs(int []arr,int i,int j){
	    if(i==0){
	        return;
	    }
	   if(j<i){
	    if(arr[j]>arr[j+1]){
	        int temp=arr[j];
	        arr[j]=arr[j+1];
	        arr[j+1]=temp;
	       
	    }
	    bbs(arr,i,j+1);
	   }
	     
	    bbs(arr,i-1,0);
	}
    
}
