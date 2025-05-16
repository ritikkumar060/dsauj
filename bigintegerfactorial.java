import java.math.BigInteger;
public class bigintegerfactorial {
    static BigInteger factorial(int num){
        BigInteger fact=new BigInteger("1");
        for(int i=2;i<num;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=45;
System.out.println(factorial(n));
    }
    
}
