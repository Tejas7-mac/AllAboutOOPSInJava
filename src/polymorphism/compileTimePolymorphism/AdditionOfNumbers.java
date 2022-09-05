package polymorphism.compileTimePolymorphism;

public class AdditionOfNumbers {

    static void sum(int firstNUmber, int secondNumber) {

        int sum = firstNUmber + secondNumber;
        System.out.println("Addition of Two Numbers is :- " +sum);

    }

    static void sum(float firstNumber, float secondNumber, float thirdNumber) {

        float sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Addition of three Numbers is :- " +sum);

    }

    static void sum(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {

        double sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("Addition of four Numbers is :- " +sum);

    }
}
