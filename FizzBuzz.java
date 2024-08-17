import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = -1;

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
                if (number < 0 || number > 100) {
                    System.out.println("The number must be between 0 and 100 grrr");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Please provide a valid integer.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Please enter a number between 0 and 100: ");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    if (number >= 0 && number <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid input. Number must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); 
                }
            }
            scanner.close();
        }
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
