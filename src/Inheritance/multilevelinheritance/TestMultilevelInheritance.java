package Inheritance.multilevelinheritance;


/**
 * The idea behind the multilevel inheritance is defined as the cain of inheritance.
 *  A -> B -> C-> D, here D inherits C inherits B inherits A.
 */

import java.security.PublicKey;

/**
 * lets a chain link of inheritance for the Puppy.
 * puppy inherits dog inherits Animals.
 */

public class TestMultilevelInheritance {

   public  static void main(String atgs[]) {

       Puppy puppy = new Puppy();

       puppy.weep();
       // when puppy grow old it will start barking also.
       puppy.bark();
       puppy.eat();
   }
}
