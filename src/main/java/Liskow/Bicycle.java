package Liskow;

public class Bicycle implements Bike{

    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("shuhsuh");
    }

    @Override
    public void accelerate(){
        System.out.println("sggs");
    }
}
