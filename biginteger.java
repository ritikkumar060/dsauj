// Object---> number ---> BigInteger
// BigInteger is used for storing large integer

import java.math.BigInteger;

public class biginteger {
    public static void main(String[] args) {
        int a=30;
        int b=67;
        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(546316424);//It is converting the integer in to BigInteger

        int c=B.intValue();// it is converting the BI in to integer
        BigInteger C=new BigInteger("145894154987465978948923456");
       
        BigInteger X=new BigInteger("1234564686745165456489746547");
        // Constants
        BigInteger D=BigInteger.TEN;

        //Addition
        BigInteger s=A.add(B);
        // BigInteger s=C.add(X);
        System.out.println(s);
        
        // Subtract
        BigInteger sub=C.subtract(B);
        System.out.println(sub);

        // multiply
        BigInteger m=C.add(X);
        System.out.println(m);


        //Divide
        BigInteger div=C.divide(B);
        System.out.println(div);



        // Comparison
        if(X.compareTo(C)<0){
            System.out.println("YES");
        }
    }    
}
