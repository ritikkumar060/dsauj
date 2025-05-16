import java.lang.Math;
public class Armstrong {
    public static void main (String args[]){
        //int x=1254;
	    //System.out.println((int)Math.log10(x)+1);
        int c;
        for (int i=1;i<=10000;i++){
             c=0;
             int n=i;
            while(n!=0){
                n=n/10;
                c++;
            }
            int m=i;
            int sum=0;
            while(m!=0){
                int r=m%10;
                // for (int k=0;k<c-1;k++){
                //     r=r*r;
                // }
                r=(int)Math.pow(r,c);
                m=m/10;
                sum=sum+r;
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
    
}
