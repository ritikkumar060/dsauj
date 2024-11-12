public class minarr {
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,6,7};
        int m=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<m){
                m=a[i];
            }
        }
        System.out.println("minimum element in an array is "+m);
    }
    
}
