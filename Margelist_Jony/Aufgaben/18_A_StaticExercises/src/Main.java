import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // Task 1
        // public int testInteger = 15;

        // Task 2
        // System.out.println(testInteger);

        // Problem: public doesnt make sense in a Method. In a class it can be so named public or private and so on,
        // where the variable can be accessed freely through class, but in a method the variable is only used within it
        // and is only called through the method.

        //Task 3
        System.out.println(Math.PI);

        //Task 4
        System.out.println(Math.random()); // Random number between 0 and 1
        System.out.println(Math.nextDown(4)); // next number below
        System.out.println(Math.nextUp(5)); // next number above




    }
}