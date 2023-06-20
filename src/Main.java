import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputQuantity;
        ArrayList<Integer> inputList = new ArrayList<>();

        inputQuantity = readNumber("Enter the quantity number: ");

        for (int i = 0; i < inputQuantity; i++) {
            inputList.add(readNumber(""));
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

    }

    public static int readNumber(String intro) {
        int inputNumber;
        System.out.print(intro);

        do {
            inputNumber = handleException();
            if (inputNumber < 1) {
                System.out.print("Please enter an integer number greater than 0: ");
            }
        } while (inputNumber < 1);

        return inputNumber;
    }

    public static int handleException() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        try {
            inputNumber = scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
        return inputNumber;
    }

}