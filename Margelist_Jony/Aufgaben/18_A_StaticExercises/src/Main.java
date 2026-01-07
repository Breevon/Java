import jdk.jshell.execution.Util;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // Task 1
//         public int testInteger = 15;

        // Task 2
//         System.out.println(testInteger);

        // Problem: public doesnt make sense in a Method. In a class it can be so named public or private and so on,
        // where the variable can be accessed freely through class, but in a method the variable is only used within it
        // and is only called through the method.

        //Task 3
//        System.out.println(Math.PI);

        //Task 4
//        System.out.println(Math.random()); // Random number between 0 and 1
//        System.out.println(Math.nextDown(4)); // next number below
//        System.out.println(Math.nextUp(5)); // next number above

        //Task 7
//        Utils.print("Hello World");

        //Task 8
//        Utils.print(2.35f);
//        Utils.print(123.8175419823d);
//        Utils.print(true);
//        Utils.print(false);
//        Utils.print('a');
//        Utils.print((byte) 32);
//        Utils.print(-5000);
//        Utils.print("Etc.");

        //Task 9
//        System.out.println(Utils.DIAMETER_SUN_KM);
//        System.out.println(Utils.DIAMETER_EARTH_KM);

        //Task 11
        Pizza carpaccio = new Pizza();
        Pizza fruttiDiMare = new Pizza();
        Pizza funghi = new Pizza();
        Pizza margherita = new Pizza();

        // Task 13
        carpaccio.getCookedPizza();
        fruttiDiMare.getCookedPizza();
        // Explaination at "Pizza.java" Task 12
    }
}