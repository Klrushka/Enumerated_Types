import task1.TrafficLight;
import task3.*;

import static task2.EnumImplementation.printNext;

public class Main {
    public static void main(String[] args) {


        /*
        Exercise 1: (2) Use a static import to modify TrafficLight.java so you don’t have to
        qualify the enum instances
         */

        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }


        System.out.println();

        /*
        Exercise 2: (2) Instead of implementing an interface, make next( ) a static method.
        What are the benefits and drawbacks of this approach?

        benefits: we don't need to use third party interfaces and use enum directly
        drawbacks: if we need to add smt new, It would be more difficult without interface, and we can forget to add methods
         */


        for (int i = 0; i < 10; i++) {
            printNext();
        }


        /*
        Exercise 10: (7) Modify class VendingMachine (only) using EnumMap so that one
        program can have multiple instances of VendingMachine.


        I copied from a book and got an infinite loop, I can't understand why
         */




    }
}

