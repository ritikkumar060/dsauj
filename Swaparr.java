import java.util.*;;
public class Swaparr {
    public static void main(String[] args) {
        int []a={1,3,5,7,9};
        System.out.println("hii"+Arrays.toString(a));
        swap(a,1,3);
        System.out.println("bye"+Arrays.toString(a));

    }
    static void swap(int [] a,int m,int n){
        int temp=a[m];
        a[m]=a[n];
        a[n]=temp;

        System.out.println("hello"+Arrays.toString(a));
    }
}
