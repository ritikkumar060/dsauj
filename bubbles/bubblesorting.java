package bubbles;

import java.util.*;
public class bubblesorting {
    public static void main(String[] args) {
        int []arr={3,2,5,1,0,7,-1};
        sorting(arr);
    }
    static void sorting(int []arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
