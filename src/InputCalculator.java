import java.util.Scanner;

public class InputCalculator {

  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int number = 0;

    while (true) {
      boolean isAnInt = scanner.hasNextInt();

      if (!isAnInt) {
        System.out.println("SUM = " + number + " AVG = " + (Math.round((double) number / (double) count)));
        break;
      } else if (isAnInt) {
        int userNumber = scanner.nextInt();
        count++;
        number += userNumber;
//        System.out.println(count);
      } else {
        System.out.println("SUM = " + number + " AVG = " + (Math.round((double) number / (double) count)));
        break;
      }
    }

    scanner.close();
  }
}

/*
1. Create class InputCaluclator
2. Create method inputThenPrintSumAndAverage
3. Set up scanner
4. Set scanner to be able to read user input
5. If user input is not a number, print error messages
6. If user input is a number
  a. Read all of the user input
  b. Add the numbers together
  c. Keep count of the number of numbers entered
  d. Display the sum of all the numbers
  e. Divide the sum of the numbers by the count
  f. Display the average
 */