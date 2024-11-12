//we have to print the character from an array which is greater than the target element
// and if the taregt element is either greatest charater or char which is greater than the last element of array then it will return the first charaacter 

public class leetcode2 {
    public static void main(String[] args) {
        char []a={'b','c','d'};
        char target='a';

        char x=leastchar(a,target);
        System.out.println(x);
//        System.out.println(target>a[0]);
    }
    static char leastchar(char []a,char target){
         int low=0;
         int high=a.length-1;
         if (target ==a[high] || target>a[high] || target<a[low] ){
            return a[0];
         }
         // if (target<a[low]){
         //    return a[low];
         // }
         while(low<=high){
            int mid=low+(high-low)/2;
             if (a[mid]==target){
                return a[mid+1];
             }           
             else if(a[mid]>target){
                if (a[mid-1]<target){
                    return a[mid];
                }
              high=mid-1;
             }
             else{
                if(a[mid+1]>target){
                    return a[mid+1];
                }
                low=mid+1;
             }
         }
         return a[0];
    }
}
