package oops.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle c=new circle();
        square s=new square();
        shape.area();
        s.area();

        shapes s1=new square();
        s1.area();// it will give output as "area of square is side*side"
    }
    
}
