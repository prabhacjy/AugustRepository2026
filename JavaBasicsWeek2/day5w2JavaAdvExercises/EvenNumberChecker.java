package day5w2JavaAdvExercises;
import java.util.Scanner;
import java.util.InputMismatchException;

// Custom exception for odd numbers
class OddNumberException extends Exception {
    public  OddNumberException(String message) {
        super(message);
    }
}

public class EvenNumberChecker {

    // Method to check if number is even, throws exception if odd
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("you enter odd number please enter even number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter an even number: ");

                // Validate that input is an integer
                System.out.println(  !scanner.hasNextInt());
         
               
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // clear invalid input
                    continue;
                }

                int num = scanner.nextInt();

                // Check if even, may throw OddNumberException
                checkEven(num);

                // If no exception, it's even
                System.out.println("you entered even number");
                break; // exit loop

            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // clear invalid input
            }
        }

        scanner.close();
    }
}