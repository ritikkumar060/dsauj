package recursion;
import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        int []arr={1,6,2,4,9,54,67,9,43,23};
        int target=9;
        int a=lsearch(arr,target,0);
        System.out.println("found at index "+a);
        boolean b=lsearch1(arr,target,0);
        System.out.println(b);
        findallindex(arr,target,0);
        System.out.println(list);
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> l=returnlist(arr,target,0,p);
        System.out.println(l);

        ///ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> l1=returnlist1(arr,target,0);
        System.out.println(l1);
    }
    //1st method
    static int lsearch(int [] arr,int target,int index){
            if(arr[index]==target){
                return index;
            }
            if(index==arr.length-1){
                return -1;
            }
            return lsearch(arr,target,index+1);
    }


    // 2nd method
    static boolean lsearch1(int [] arr,int target,int index){
        
        if(index==arr.length){
            return false;
        }
        return arr[index]==target ||lsearch1(arr,target,index+1);
}
 

//3rd method
static ArrayList<Integer> list=new ArrayList<>();
  static void findallindex(int []arr,int target,int index){
    if(index==arr.length){
        return;
    }
    if(arr[index]==target){
        list.add(index);
    }
    findallindex(arr,target,index+1);
  }

//4th method
  static ArrayList<Integer> returnlist1(int []arr,int target,int index){
    ArrayList<Integer> list=new ArrayList<>();
          if(index==arr.length){
            return list;
          }
          if(arr[index]==target){
            list.add(index);
          }
         ArrayList<Integer> belofuncall=returnlist1(arr,target,index+1);
         list.addAll(belofuncall);
         return list;
  }





//5th method
  static ArrayList<Integer> returnlist(int []arr,int target,int index,ArrayList<Integer> p){
    if(index==arr.length){
      return p;
    }
    if(arr[index]==target){
      p.add(index);
    }
   return returnlist(arr,target,index+1,p);
   
}

   

}
