 // Object---> number ---> BigDecimal
 // it containd a random precision integer unscaled value & 32 bit int scale
 // >=0 =>scale=no of digits  right of decimal point
 // else unscale value 10^-scale
 // double and float can give some error due to the float and double are floating point number binary representation of a fraction and an exponent
// it gives the exact value for a double

import java.math.BigDecimal;

public class bigdecimal {
    public static void main(String[] args) {


        double d1=0.03;
        double d2=0.04;
        System.out.println(d2-d1);// it is not giving the exact answer

        BigDecimal X= new BigDecimal("0.05");
        BigDecimal Y= new BigDecimal("0.04");
        BigDecimal res= Y.subtract(X);
        System.out.println(res);

        BigDecimal a= new BigDecimal("465761654.164984");
        BigDecimal b= new BigDecimal("6549465.1654");
        // operations
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        // System.out.println(a.divide(b));//  it does not support in BigDecimal
        System.out.println(a.pow(6));
        System.out.println(a.negate());

        // Constant
        BigDecimal con =BigDecimal.ONE;
        System.out.println(con);
    }
    
}
