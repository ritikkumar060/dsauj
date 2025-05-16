package recursion; 
public class sortedarray {
    public static void main(String[] args) {
        int []a={1,2,3,4,52,6};
        boolean b=sorted(a,0);
        System.out.println(b);
    }
      static boolean sorted(int [] a,int index){
        if(index==a.length-1){
            return true;
        }
        return (a[index]<a[index+1]) && sorted(a,index+1);
      }
}
