package Inheritance.multipleInheritance;

public class Animal implements AnimalEat,AnimalTravel{
    @Override
    public void eat() {
        System.out.println("Animals Are eating..");
    }

    @Override
    public void travel() {
      System.out.println("Let's travel with animals...(:");
    }
}
