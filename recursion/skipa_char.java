package recursion;

public class skipa_char {
    public static void main(String[] args) {
        String s="ritikkumartiwari";
        String p=skipi(s,0,"");
        System.out.println(p);
        String q=skipr(s,0);
        System.out.println(q);
        String r=skipkumar(s);
        System.out.println(r);
        String w=skipkumnotkumar(s);
        System.out.println(w);
        
    }
    static String skipi(String s,int i,String p){
        if(i==s.length()){
            return p;
        }
        else{
            if(s.charAt(i)=='i'){
                return skipi(s,i+1,p);
            }
            else{
            return skipi(s,i+1,p+s.charAt(i));
                }
        }
    }



    static String skipr(String s,int i){
        String p="";
        if(i==s.length()){
            return p;
        }
        else{
            if(s.charAt(i)=='r'){
                return skipr(s,i+1);
            }
            else{
            return s.charAt(i)+skipr(s,i+1);
                }
        }
    }




    static String skipkumar(String s){
        //String p="";
        if(s.isEmpty()){
            return "";
        }
        else{
            if(s.startsWith("kumar")){
                return skipkumar(s.substring(5));
            }
            else{
            return s.charAt(0)+skipkumar(s.substring(1));
                }
        }
    }


    static String skipkumnotkumar(String s){
        //String p="";
        if(s.isEmpty()){
            return "";
        }
        else{
            if(s.startsWith("kum") && !s.startsWith("kumar")){
                return skipkumnotkumar(s.substring(3));
            }
            else{
            return s.charAt(0)+skipkumnotkumar(s.substring(1));
                }
        }
    }



}
