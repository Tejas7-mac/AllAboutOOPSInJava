package Inheritance.singleInheritance;

/**
 * when a class inherits another class , its know as single inheritance.
 */

/**
 * Here we can see an example of  dog inheriting animal class .
 * The dog is having "is a" relationship with animal i.e dog is an animal.
 * where all animals will eat and dog also eats .
 * So we have the eat method in animals which will used by all the animals.
 */

public class TestSingleInheritance {

    public static  void main(String args[]) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
