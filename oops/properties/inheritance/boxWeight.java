package oops.properties.inheritance;

public class boxWeight extends box{
    double weight;
    boxWeight()
    {
        this.weight=-1;
    }

    boxWeight(double l,double h,double w,double weight){
        // this.l=l;
        // this.h=h;
        // this.w=w;
        super(l,h,w);// call the parent class constructer ...  used to initialize the variable present in the parent class
        this.weight=weight;
       }
    
}
