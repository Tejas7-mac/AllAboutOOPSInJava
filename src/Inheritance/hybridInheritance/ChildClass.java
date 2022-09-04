package Inheritance.hybridInheritance;

public class ChildClass extends HumanBody implements Male,Female{

    @Override
    public void show() {
        System.out.println("implementation of Show method which is present in both Male and Female Interface..!");
    }

    public void displayChild() {
        System.out.println("We are present in child class...!");
    }
}
