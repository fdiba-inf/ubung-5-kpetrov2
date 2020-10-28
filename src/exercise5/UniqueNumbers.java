package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int count = 0;
        int[] uniqueNumbers = new int[numbers.length];
        

        for (int index = 0; index < numbers.length; index++) {

          boolean number = false;
          for (int j = 0; j < uniqueNumbers.length; j++) {
              if (numbers[index] == uniqueNumbers[j]) {
                number = true;}
          }
            if (number == false) {
              uniqueNumbers[count] = numbers[index];
              count++;
            }
          }
        
        // Find unique numbers in numbers

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
  }