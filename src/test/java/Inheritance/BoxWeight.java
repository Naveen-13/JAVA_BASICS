package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }

    BoxWeight(){

    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight = weight;
        
    }
}
