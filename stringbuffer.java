// StringBuffer :- it mutable sequence of character (bcz Strings are immutable)
// Advantage 1.Mutable
// 2.Efficient
//3. Thread safe(but little bit slower) (String builder is not thread safe)
// 4. 
public class stringbuffer {
          public static void main(String[] args) {
            // Constructer 1
            StringBuffer sb=new StringBuffer();
         //    System.out.println(sb.capacity());

          // Constructer 2
           StringBuffer sb2=new StringBuffer("Ritik kumar");
            System.out.println(sb2);
         
          // Constructer 3
           StringBuffer sb3=new StringBuffer(30);
             System.out.println(sb3.capacity());

           sb.append("WeMakeDev");
             sb.append(" ritik ");
           //  sb.insert(2," hello ");
           
           sb.replace(1,5, "hiiiiii");

           String str=sb.toString();
            System.out.println(str);
          }    
}
