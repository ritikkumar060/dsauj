public class prime {
    public static void main(String[] args) {
        int n=100;
        boolean []primes=new boolean[n+1];
        sieve(n,primes);

    }
     static void sieve (int n,boolean []primes){
        for(int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j=j+i){
                primes[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n+1;i++){
            if(!primes[i])
            {
            c++;
            System.out.print(i+ " ");
            }
        }
        System.out.println(c+ " ");
     }
}

/// NEWTON RAPSON METHOD
/// root=(x+n/x)/2  here x is assumes as the square root  but root is actual square root 