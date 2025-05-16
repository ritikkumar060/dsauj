package recursion;

import java.util.Arrays;

public class mergesortinplace {
    public static void main(String[] args) {
        int [] arr={8,3,4,12,5,6};
        divide(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
      

    static void divide(int []arr,int s,int e){
        if(e-s==1){
            return ;
        }
        int mid=(e+s)/2;
        divide(arr,0,mid);
        divide(arr,mid,e);
         merge(arr,s,mid,e);
    }
   


    static void merge(int []arr,int s,int mid,int e){
        int []mix=new int [e-s]; 
        int i=s;
         int j=mid;
         int k=0;
        
         while(i<mid&& j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
               
            }
             else{
                mix[k]=arr[j];
                j++;
               
             }
             k++;
             
         }
         while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
         }
         while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
         }
         for( i=0;i<mix.length;i++)
         {
            arr[s+i]=mix[i];
         }
        //  return mix;
    }
    
}
