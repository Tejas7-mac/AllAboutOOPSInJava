package polymorphism.runTimePolymorphism;

import polymorphism.runTimePolymorphism.Apache;
import polymorphism.runTimePolymorphism.Bike;

public class TestRunTimePolymorphism {

    public static void main(String []args) {
        Bike bike = new Apache();
        bike.run();
    }
}
