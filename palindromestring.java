public class palindromestring {
    public static void main(String[] args) {
        String s="";
        s=s.toLowerCase();
        int j=s.length();
        int c=0;
        for (int i=0;i<=s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(j-1-i)){
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
