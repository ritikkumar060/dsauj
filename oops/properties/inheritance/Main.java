package oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // box b=new box();
        // System.out.println(b.l+" "+b.h+" "+b.w);

        // box b=new box(4);
        // System.out.println(b.l+" "+b.h+" "+b.w);

        // box b=new box(2,4,5);
        // System.out.println(b.l+" "+b.h+" "+b.w);

        // box b=new box(1,2,3);
        // box b2=new box(b);
        // System.out.println(b2.l+" "+b2.h+" "+b2.w);

        boxWeight box3=new boxWeight();
        System.out.println(box3.h+" " +box3.weight);
        boxWeight box4=new boxWeight(2,3,4,5);
    }
    
}
