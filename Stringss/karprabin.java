package Stringss;
// import java.util.*;
// import java.io.*;
// import java.lang.*;
 // karp rabin algorithm 
// a="kunal"    b="apoorvkunalr" 
// h(a)=h(b[i:i+len(a)])
// * may be found a match
   // then check every character o(a)
      // if all characters are same then the answer found
   // but there is a chance of getting same hash valur for two string but actually they are not same and probability of this is p=1/len(a)  {universal hashing}
 
// expected cost per index(i)=o(1)
//Time=o(len(a)+len(b)*cost of hash function)


public class karprabin {
    private final int PRIME=101;

    private double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash=hash + str.charAt(i) * Math.pow(PRIME,i);
        }
        return hash;
    }
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
        double newHash=(prevHash-oldChar)/PRIME;
        newHash=newHash+newChar*Math.pow(PRIME,patternLength-1);
        return newHash;
    }
    public void Search(String text,String pattern){
        int patternLength=pattern.length();
        double  patternHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(0,patternLength));
  int p=0;
        for(int i=0;i<text.length()-patternLength;i++){
            if(textHash==patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("pattern found at index "+i);
                    p++;
                 //   return;
                }
            }
            if(i<text.length()-patternLength){
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
        if(p==0){
            System.out.println("pattern not found in the text");
        }

    }
    public static void main(String[] args) {
        String a="ritik";
        String b="kuamrritiktiwari";
      karprabin kr=new karprabin();
      kr.Search(b,a);
    }
}
