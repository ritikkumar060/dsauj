import java.util.*;
public class search2darr {
    public static void main(String[] args) {
        int [][]a={
            {1,2,3},
            {4,5,6,7},
            {8,9}
        };
        int target=55;


        int []arr=search(a,target);
        System.out.println(Arrays.toString(arr));

        max(a); 
    }
    


// to check weather the given target element is present in the given array or not
//if it found in the array it should return the array which contains two element i.e. row and column 
    static int[] search(int [][]arr,int target){
        for (int i=0;i<arr.length;i++){
              for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    System.out.println("element found at index "+i+","+j);
                    return new int[]{i,j};
                }
              }
        }
        System.out.println("element not found in the given array");
    return new int[]{-1,-1};
}




//take input from main method and print the largest element in this max method
// to find out the maximum element of an array
     static void max(int [][]arr){
        int m=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               if (arr[i][j]>m){
                m=arr[i][j];
               }
            }
        }
        System.out.println("largest lement of array is "+m);
     }





}
