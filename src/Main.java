import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputQuantity;
        ArrayList<Double> inputList = new ArrayList<>();

        System.out.print("Enter the quantity number: ");
        try {
            inputQuantity = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            return;
        }

        if (inputQuantity < 2) {
            System.out.println("Quantity must be greater than 1!");
            return;
        }

        for (int i = 0; i < inputQuantity; i++) {
            try {
                inputList.add(scanner.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Input error!");
                return;
            }
        }

        double largest = inputList.get(0);
        double secondLargest = inputList.get(0);

        for (int i = 1; i < inputQuantity; i++) {
            double tmp = inputList.get(i);

            if (tmp > largest) {
                secondLargest = largest;
                largest = tmp;
                continue;
            }

            if (tmp != largest && (tmp > secondLargest || largest == secondLargest)) {
                secondLargest = tmp;
            }
        }

        if (largest == secondLargest) {
            System.out.println("Array does not exist 2nd largest number!");
        } else {
            System.out.println("The 2nd largest number is " + secondLargest);
        }

        scanner.close();
    }

}