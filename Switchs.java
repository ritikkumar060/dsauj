import java.util.*;
public class Switchs {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        // String fruit=sc.next();
        int day=sc.nextInt();
        sc.close();
//         switch(fruit)
// {
//     case "mango":
//     System.out.println("king of fruits");
//     break;
//     case "apple":
//     System.out.println("red fruit");
//     break;
//     default:
//     System.out.println("other than apple and mango");
//}
 switch (day){
    case 1,2,3,4,5:
    System.out.println("weekday");
    break;
    case 6,7:
    System.out.println("weekend");
    break;
    default:
    System.out.println("enter other number");
 }
        
    }
    
}
/* 
Note:
- cases have to be the same type as expressions , must be a constant or literal
-duplicate case values are not allowed 
-break is use to terminate the sequence 
-if break is not used , it will continue to next case
-default will execute when none of the above does 
-if default is not at the end, put break after it 
*/