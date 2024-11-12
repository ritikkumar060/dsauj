import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8};
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key element to be search:");
        // IT WILL HELP IN SEARCHING IN AARAY
    //    System.out.println(Integer.MIN_VALUE);
        int key=sc.nextInt();
        int k=linearsearch(a,key);
        if (k==-1){
            System.out.println("key element not found in the array ");
        }
        else{
            System.out.println("element found at index "+k);
        }
        sc.close();
    }

    //search in the array :if element found then return the index
    // return -1 if the element not found in the array  
    static int linearsearch(int []arr,int key){
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }

}
