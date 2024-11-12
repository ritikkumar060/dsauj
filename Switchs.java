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
