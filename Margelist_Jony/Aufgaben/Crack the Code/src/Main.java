import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);

        int randomNumber1 = rand.nextInt(10);
        int randomNumber2 = rand.nextInt(10);
        int randomNumber3 = rand.nextInt(10);
        int randomNumber4 = rand.nextInt(10);

        System.out.println("Its a 4-digit number");
        System.out.println("Take a guess");
        int userGuess = userInput.nextInt();

        int number1 = userGuess.substring(0,1);



















        userInput.close();
    }
}