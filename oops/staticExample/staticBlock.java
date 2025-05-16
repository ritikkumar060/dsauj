package oops.staticExample;
// this is a demo to show the initialization of static variables
public class staticBlock {
    static int a=4;
    static int b;
    // it will run only once when the first object is created i.e. when the class is loaded for the first time
    static {
        System.out.println("i am in the static block");
        b=a*5;
    }
        public static void main(String[] args) {
           // staticBlock obj=new staticBlock();
            System.out.println(a);
            System.out.println(b);
            System.out.println();
            staticBlock.b +=3;

        System.out.println(a);
        System.out.println(b);
        System.out.println();
        //staticBlock obj2=new staticBlock();
        System.out.println(a);
        System.out.println(b);
    }
    
}
