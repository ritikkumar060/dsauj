  import java.util.*;

public class Arraylist1{
    public static void main(String args []){
       
    
    Scanner sc=new Scanner(System.in);
  
        // Syntax
     ArrayList <Integer> list=new ArrayList<>(10);
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     list.add(6);
     list.add(7);
     list.add(8);
     list.add(9);
     list.add(10);
     list.add(11);
     list.add(12);
     list.add(13);

   System.out.println(list);
  
   list.set(0,99);
  
   System.out.println(list);
  
   list.remove(2);
  
   System.out.println(list);
  
   System.out.println(list.contains(11));
   
   

   // input of a list
   for (int i=0;i<5;i++){
    list.add(sc.nextInt());
   }



   // for getting output
   for (int i=0;i<5;i++){
    System.out.println(list.get(i));// pass the index here, list[index] synatax will not work here
   }
   
   

   sc.close();
}
}