import java.util.*;
public class SerachInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name ="ritik";
        char c=(sc.next()).charAt(0);
        boolean x=search(name,c);
        System.out.println(x);
        
        
        sc.close();
    }
    static boolean search(String name,char target){
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

}
