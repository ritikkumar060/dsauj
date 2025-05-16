package oops.staticExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello ");
        human h=new human(21,"ritik",100000,false);
        human p=new human(22,"raushan",212121,true);
        System.out.println(h.name);
        System.out.println(p.name);
       // System.out.println(h.population);
        System.out.println(human.population);
        // we know that which is not static belongs to an object
        // you cannot access non static stuff without referencing their instances in a static context
        Main m=new Main();
        m.greeting();
    }
    void greeting(){
        System.out.println("heelo guys!");
    }
}
