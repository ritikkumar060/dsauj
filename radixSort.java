// find out  no of digits of largest element { e.g.- 471 :: count sort will be apply 3 times}
// sort the array using count sort digit by digit , starting from least
// 
import java.util.*;
public class radixSort {
    public static void radixsorting(int [] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        // do count for every digit place
       for(int exp=1; max/exp>0;exp*=10){
        counsorting(arr,exp);
       }

    }
    public static void counsorting(int [] arr, int exp){
        int n=arr.length;
        int [] output=new int[n];
        int [] count=new int[10];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        System.out.println("\ncount array for "+exp+" : "+Arrays.toString(count));

        for(int i=1;i<10;i++){
            count[i]=count[i]+count[i-1];
        }
        System.out.println("updated count array "+Arrays.toString(count));
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;

        }
        System.arraycopy(output,0,arr,0,n);

    }
    public static void main(String[] args) {
     int [] arr={29,83,471,36,91,8};
     System.out.println(Arrays.toString(arr)); 
     radixsorting(arr);
     System.out.println(Arrays.toString(arr));   
    }
}
