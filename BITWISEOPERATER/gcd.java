public class gcd {
    public static void main(String[] args) {
        int a=gcd1(10,20);
        int b=lcm(10,20);
        
        System.out.println(a);
        System.out.println(b);
    }
    static int gcd1(int a,int b){
        if(a==0){
            return b;
        }
     return gcd1(b%a,a);

    }

    static int lcm(int a,int b){
        
     return a*b/gcd1(a,b);

    }

}
