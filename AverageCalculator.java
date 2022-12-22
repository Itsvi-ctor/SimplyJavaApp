import java.util.Scanner;

public class AverageCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ask the user how many numbers they want to enter
    System.out.print("How many numbers do you want to enter? ");
    int count = scanner.nextInt();

    // Initialize a sum variable to 0
    double sum = 0;

    // Read the numbers from the user and add them to the sum
    for (int i = 0; i < count; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      double number = scanner.nextDouble();
      sum += number;
    }

    // Compute the average
    double average = sum / count;

    // Print the result
    System.out.println("The average is: " + average);
    scanner.close();
  }
}
