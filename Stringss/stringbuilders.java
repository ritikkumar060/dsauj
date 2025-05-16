package Stringss;

public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch);
            
        }
        sb.deleteCharAt(0);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
    
}
