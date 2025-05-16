import java.util.Random;
import java.util.Arrays;
public class randomstring {
    static String generate(int size){
        StringBuffer sb=new StringBuffer(size);
        Random random=new Random();
         
        for(int i=0;i<size;i++){
            int randomChar=97+(int)(random.nextFloat()*26);
          sb.append((char)randomChar);
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
         int n=20;
         String name=generate(n);
         System.out.println(name);

         // Remove whitespaces
         String sentence ="my name is ritik kumar";
         System.out.println(sentence);

         System.out.println(sentence.replaceAll("\\s",""));


// split
String names="Ritik Raushan Aman Abhi Pathak";
String []arr=names.split(" ");
System.out.println(Arrays.toString(arr));

    }
    
}
