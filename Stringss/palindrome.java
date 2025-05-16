package Stringss;
// using stringbuilder 
public class palindrome {
    public static void main(String[] args) {
        String s="abbma";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("Not palindrome string");
        }
    }
}
