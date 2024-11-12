// this method is used for finding largest number and put it at the correct index


import java.util.*;
public class selectionsort2 {
    public static void main(String[] args) {
        int []arr={4,5,2,0,8,7};
        for (int i=0;i<arr.length-1;i++){
            int max=arr.length-1-i;
            int s=arr.length-1-i;
            for (int j=arr.length-2-i;j>=0;j--){
                if (arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[s];
            arr[s]=temp;
          
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
