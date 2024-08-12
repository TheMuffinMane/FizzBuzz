import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

       
        while (number < 0 || number > 100) {
            System.out.print("Enter a number between 0 and 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0 || number > 100) {
                    System.out.println("Invalid input. Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
                scanner.next(); 
            }
        }

      
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        scanner.close();
    }
}
