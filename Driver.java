import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
            System.out.print("Enter the first integer: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int secondNumber = scanner.nextInt();
    if (secondNumber == 0 || firstNumber % secondNumber != 0) {
           throw new invalidFactorException(
                        secondNumber + "is not a factor of " + firstNumber);
            }

    System.out.println(secondNumber + " is a proper factor of " + firstNumber);
        } catch (invalidFactorException exception) {
            System.out.println("Invalid factor: " + exception.getMessage());
        } catch (InputMismatchException exception) {
            System.out.println("Please enter integer values only.");
        } finally {
            scanner.close();
        }
    }
}
class invalidFactorException extends Exception {
    public invalidFactorException(String message) {
        super(message);
    }
}
