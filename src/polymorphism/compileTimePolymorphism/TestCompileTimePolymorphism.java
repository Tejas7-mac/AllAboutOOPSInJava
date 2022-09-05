package polymorphism.compileTimePolymorphism;

public class TestCompileTimePolymorphism {

    public static void main(String []args) {
        AdditionOfNumbers add = new AdditionOfNumbers();

        add.sum(1, 2);

        add.sum(2.0F, 3.0F, 4.0F);

        add.sum(2.0, 3.0, 4.0, 5.0);
    }


}
