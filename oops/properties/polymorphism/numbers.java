package oops.properties.polymorphism;

public class numbers {
   int sum(int a,int b){
    return a+b;
   }
   int sum(int a,int b ,int c){
    return a+b+c;
   }
    public static void main(String[] args) {
        numbers num=new numbers();
        num.sum(4,5);
        num.sum(3,4,5);
//        num.sum(1,2,4,5);
    }
    
}
