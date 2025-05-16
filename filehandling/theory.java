// Streams - Sequence of data {byte or character(unibyte)}
// Streams -Abstraction that java provides 
// JAVA implements these wityhin the class heirarchy in juava.io package

// types of stream in java
//1. Byte Stream --> i> Input stream  ii> Output Stream
// 2. character stream  --> i> Reader  ii> Writer


// Predefined Stream 
//1.System.out - standard output stream -->console
//2.System.in - standard input stream -->keyboard
//3.System.err - standard Error -->console
package filehandling;
import java.io.*;


public class theory {
    public static void main(String[] args) {
       try( FileReader f=new FileReader("note.txt"))
       {
        System.out.println(f.read());
       }
       catch(IOException e){
        System.out.println(e.getMessage());
       }
       }
    
}
