package Inheritance.hierarchical;

/**
 * The idea of hierarchical inheritance is , Two or more classes inherits the same class.
 */

/**
 * Here in our examples the cat and dog both can eat but the dog will bark and the cat will meow .
 * Both cat and dog is having " is  a " relationship with Animal.
 */
public class TestHierarchicalInheritance  {

    public static void main(String []args) {

        Cats cat = new Cats();
        cat.eat();
        cat.meow();
        // cat cannot bark.
    }
}
