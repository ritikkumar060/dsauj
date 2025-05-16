package recursion;

public class stairclimbing {
    public static void main(String[] args) {
        int k=climbStairs(25);
        System.out.println(k);
    }
    static  int climbStairs(int n) {
        if(n==0){
        return 1;
    }
    if(n<0){
        return 0;
    }
   return climbStairs(n-1)+climbStairs(n-2);
    }
}
